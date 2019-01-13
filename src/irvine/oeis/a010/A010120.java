package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010120.
 * @author Sean A. Irvine
 */
public class A010120 implements Sequence {

  private Z mM = null;
  private Z mPrev = Z.ONE;

  @Override
  public Z next() {
    mM = mM == null ? Z.ONE : mM.multiply2();
    Z n = mPrev;
    while (true) {
      Z t = n;
      while (true) {
        if (t.equals(mM)) {
          mPrev = n;
          return n;
        }
        if (Z.ONE.equals(t)) {
          break;
        }
        if (t.isEven()) {
          t = t.divide2();
        } else {
          t = t.multiply(3).add(1);
        }
      }
      n = n.add(1);
    }
  }
}

