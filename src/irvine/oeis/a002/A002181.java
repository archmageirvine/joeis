package irvine.oeis.a002;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A002181 Least number k such that phi(k) = m, where m runs through the values (A002202) taken by phi.
 * @author Sean A. Irvine
 */
public class A002181 extends Sequence1 {

  private static final List<Z> INITIAL = Arrays.asList(Z.ONE, Z.TWO);
  private Z mN = null;

  protected Z select(final Collection<Z> c) {
    return ZUtils.min(c);
  }

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ZERO;
      return select(INITIAL);
    }
    while (true) {
      mN = mN.add(2);
      final Set<Z> c = InverseEuler.inversePhi(mN);
      if (!c.isEmpty()) {
        return select(c);
      }
    }
  }
}
