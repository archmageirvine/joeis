package irvine.oeis.a084;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006046;

/**
 * A084230 Cumulative minima of A006046(n)/n^theta, where theta=log(3)/log(2), is a local minimum.
 * @author Sean A. Irvine
 */
public class A084230 extends Sequence1 {

  // Not certain this implementation is correct

  private final TreeSet<Z> mA = new TreeSet<>();
  private static final CR EXPONENT = CR.THREE.log().divide(CR.LOG2);
  private final A006046 mF = new A006046();
  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ONE;
      return Z.ONE;
    }
    if (!mA.isEmpty()) {
      mN = mA.pollFirst();
      return mN;
    }
    final Z n2 = mN.multiply2();
    final Z n2m = n2.subtract(1);
    final Z n2p = n2.add(1);
    final CR m = CR.valueOf(mF.a(n2m)).divide(CR.valueOf(n2m).pow(EXPONENT));
    final CR p = CR.valueOf(mF.a(n2p)).divide(CR.valueOf(n2p).pow(EXPONENT));
    if (m.compareTo(p) <= 0) {
      final Z n2m2 = n2.subtract(3);
      final CR m2 = CR.valueOf(mF.a(n2m2)).divide(CR.valueOf(n2m2).pow(EXPONENT));
      if (n2m2.signum() > 0 && m2.compareTo(p) <= 0) {
        mA.add(n2m);
        mN = n2m;
        return n2m2;
      }
      mN = n2m;
    } else {
      mN = n2p;
    }
    return mN;
  }
}
