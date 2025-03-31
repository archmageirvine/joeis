package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a018.A018247;
import irvine.oeis.a018.A018248;

/**
 * A076308 Product of 10-adic numbers defined in A018247 &amp; A018248.
 * @author Sean A. Irvine
 */
public class A076308 extends Sequence1 {

  private final Sequence mASeq = new A018247();
  private final Sequence mBSeq = new A018248();
  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mM = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(10).add(mASeq.next());
    mA = mA.multiply(10).add(mASeq.next());
    mB = mB.multiply(10).add(mBSeq.next());
    mB = mB.multiply(10).add(mBSeq.next());
    mM = mM.multiply(1000);
    return mA.multiply(mB).divide(mM).mod(Z.TEN);
  }
}
