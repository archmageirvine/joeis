package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a008.A008578;

/**
 * A055497 a(-1) = 4, a(0) = 5; thereafter a(n) = 4 + (Product_{k=1..n} prime(k))^2.
 * @author Sean A. Irvine
 */
public class A055497 extends AbstractSequence {

  private final A008578 mSeq1 = new A008578();

  /** Construct the sequence. */
  public A055497() {
    super(-1);
  }

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.FOUR;
    }
    mA = mA.multiply(mSeq1.next().square());
    return mA.add(4);
  }
}
