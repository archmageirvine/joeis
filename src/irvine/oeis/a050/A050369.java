package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a074.A074206;

/**
 * A050369 Number of ordered factorizations of n into 2 kinds of 2, 3 kinds of 3, ...
 * @author Sean A. Irvine
 */
public class A050369 extends AbstractSequence {

  private final A074206 mSeq1 = new A074206();

  /** Construct the sequence. */
  public A050369() {
    super(1);
  }

  {
    mSeq1.next();
  }

  private long mN = 0;

  @Override
  public Z next() {
    return mSeq1.next().multiply(++mN);
  }
}
