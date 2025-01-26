package irvine.oeis.a074;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A074755 Number of n-digit non-leading-zero trimorphic numbers (m such that m^3 ends in m).
 * @author Sean A. Irvine
 */
public class A074755 extends Sequence1 {

  // After Robert Israel

  private static final Z[] B = {Z.ZERO, Z.ONE, Z.NEG_ONE};
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.TEN.pow(mN++);
    final Z[] mods = {Z.TWO.pow(mN), Z.FIVE.pow(mN)};
    final HashSet<Z> res = new HashSet<>();
    for (final Z b : B) {
      res.add(ZUtils.chineseRemainderTheorem(new Z[] {Z.ZERO, b}, mods));
      res.add(ZUtils.chineseRemainderTheorem(new Z[] {Z.ONE, b}, mods));
      res.add(ZUtils.chineseRemainderTheorem(new Z[] {Z.NEG_ONE, b}, mods));
      res.add(ZUtils.chineseRemainderTheorem(new Z[] {Z.TWO.pow(mN - 1).subtract(1), b}, mods));
      res.add(ZUtils.chineseRemainderTheorem(new Z[] {Z.TWO.pow(mN - 1).add(1), b}, mods));
    }
    long cnt = 0;
    for (final Z v : res) {
      if (v.compareTo(t) >= 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
