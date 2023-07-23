package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001181;

/**
 * A046996 Number of Baxter permutations: A001181/2.
 * @author Sean A. Irvine
 */
public class A046996 extends AbstractSequence {

  private final A001181 mSeq1 = new A001181();

  /** Construct the sequence. */
  public A046996() {
    super(2);
  }

  {
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
