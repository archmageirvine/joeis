package irvine.oeis.a345;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A345709 A variation on the Yellowstone permutation: a(n) = n if n &lt;= 3, a(4) = 5; otherwise the smallest number not occurring earlier having at least one common factor with a(n-2), but none with a(n-1), with the condition that two odd terms alternate with one even term.
 * @author Sean A. Irvine
 */
public class A345709 implements Sequence {

  private final TreeSet<Z> mS = new TreeSet<>();
  private Z mA = null;
  private Z mB = null;
  private int mState = 0; // 0, 1 (odd terms), 2 (even term)

  //  A variation on the Yellowstone permutation: a(n) = n if n <= 3, otherwise the smallest number not occurring earlier having at least one common factor with a(n-2), but none with a(n-1), with the condition that two odd terms alternate with one even term.

  @Override
  public Z next() {
    if (mB == null) {
      if (mS.isEmpty()) {
        mS.add(Z.ONE);
        return Z.ONE;
      }
      if (mA == null) {
        mA = Z.TWO;
        mS.add(Z.TWO);
        return Z.TWO;
      }
      mB = Z.THREE;
      mS.add(Z.THREE);
      return Z.THREE;
    }
    if (++mState == 3) {
      mState = 0;
    }
    if (Z.THREE.equals(mB)) {
      mA = mB;
      mB = Z.FIVE;
      mS.add(Z.FIVE);
      return mB;
    }
    Z t = mState < 2 ? Z.NEG_ONE : Z.ZERO; // select even/odd starting point
    while (true) {
      t = t.add(2);
      if (!mS.contains(t) && mA.gcd(t).compareTo(Z.ONE) > 0 && mB.gcd(t).equals(Z.ONE)) {
        mA = mB;
        mB = t;
        mS.add(t);
        return t;
      }
    }
  }
}
