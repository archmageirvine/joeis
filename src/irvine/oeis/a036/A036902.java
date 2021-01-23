package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.a032.A032510;

/**
 * A036902 Scan decimal expansion of zeta(3) until all n-digit strings have been seen; a(n) is last string seen.
 * @author Sean A. Irvine
 */
public class A036902 extends A032510 {

  @Override
  protected CR getCR() {
    return Zeta.zeta(3);
  }
}
