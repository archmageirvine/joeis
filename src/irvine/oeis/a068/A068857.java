package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068857 a(0) = 0, a(1) = 8; for n&gt;=2: a(n) = smallest multiple of a(n-1) which is of the form 2k*(2k+2).
 * @author Sean A. Irvine
 */
public class A068857 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else if (mA.isZero()) {
      mA = Z.EIGHT;
    } else {
      Z t = mA;
      while (true) {
        t = t.add(mA);
        // k should be close to (1/2)*(sqrt(1+t)-1)
        final Z s = t.add(1).sqrt().andNot(Z.ONE); // makes s even
        if (t.equals(s.multiply(s.add(2))) || t.equals(s.multiply(s.subtract(2)))) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }

//  private Z mA = null;
//  private long mK = 1;
//
//  @Override
//  public Z next() {
//    if (mA == null) {
//      mA = Z.ZERO;
//    } else if (mA.isZero()) {
//      mA = Z.EIGHT;
//    } else {
//      while (true) {
//        final Z t = Z.valueOf(2 * ++mK).multiply(2 * mK + 2);
//        if (t.mod(mA).isZero()) {
//          mA = t;
//          break;
//        }
//      }
//    }
//    return mA;
//  }
}
