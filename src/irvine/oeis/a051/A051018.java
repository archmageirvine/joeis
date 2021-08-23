package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a171.A171102;

/**
 * A051018 Numbers that are 2-persistent but not 3-persistent.
 * @author Sean A. Irvine
 */
public class A051018 extends A171102 {

  private boolean isPandigital(final Z n) {
    final int[] cnts = ZUtils.digitCounts(n);
    for (final int c : cnts) {
      if (c == 0) {
        return false;
      }
    }
    return true;
  }

  protected int persistence() {
    return 2;
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z pandigital = super.next();
      for (int k = 2; k <= persistence(); ++k) {
        if (!isPandigital(pandigital.multiply(k))) {
          continue outer;
        }
      }
      if (!isPandigital(pandigital.multiply(persistence() + 1))) {
        return pandigital;
      }
    }
  }
}
