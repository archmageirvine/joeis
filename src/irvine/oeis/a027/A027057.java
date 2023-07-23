package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027057 a(n) = (1/2) * A027052(n, 2n-1).
 * @author Sean A. Irvine
 */
public class A027057 extends AbstractSequence {

  private final A027056 mSeq1 = new A027056();

  /** Construct the sequence. */
  public A027057() {
    super(2);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
