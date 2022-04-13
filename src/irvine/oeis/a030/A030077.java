package irvine.oeis.a030;

import java.util.HashSet;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a352.A352568;

/**
 * A030077 Take n equally spaced points on circle, connect them by a path with n-1 line segments; sequence gives number of distinct path lengths.
 * @author Sean A. Irvine
 */
public class A030077 extends A352568 {

  // WARNING: Do not use this to extend the sequence as results for n>=15 are suspect
  // due to numerical precision issues.

  private static final int PRECISION = 100;

  @Override
  public Z next() {
    step();

    // Some different polygons in mA are actually the same length
    // I would like a smarter method of determining when they are the same
    final CR[] a = new CR[mN / 2 + 1];
    for (int k = 0; k <= mN / 2; ++k) {
      a[k] = CR.TWO.subtract(CR.TWO.multiply(ComputableReals.SINGLETON.cos(CR.PI.multiply(new Q(2L * k, mN))))).sqrt();
    }
    final HashSet<String> unique = new HashSet<>(mA.size());
    for (final List<Integer> v : mA) {
      CR sum = CR.ZERO;
      for (int k = 1; k < v.size(); ++k) {
        sum = sum.add(a[k].multiply(v.get(k)));
      }
      unique.add(sum.toString(PRECISION).substring(0, 50));
    }
    return Z.valueOf(unique.size());
  }

}
