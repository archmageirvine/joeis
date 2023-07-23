package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001035;

/**
 * A002824 Number of precomplete Post functions.
 * @author Sean A. Irvine
 */
public class A002824 extends AbstractSequence {

  private final A001035 mSeq1 = new A001035();

  /** Construct the sequence. */
  public A002824() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return mSeq1.next().multiply(Binomial.binomial(++mN, 2));
  }
}
