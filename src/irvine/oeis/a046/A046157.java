package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.cr.EulerGamma;
import irvine.oeis.a036.A036412;

/**
 * A046157 Number of empty intervals when fractional_part(i*gamma) for i = 1, ..., n is plotted along [ 0, 1 ] subdivided into n equal regions, where gamma is the Euler-Mascheroni constant.
 * @author Sean A. Irvine
 */
public class A046157 extends A036412 {

  @Override
  protected CR getCR() {
    return EulerGamma.SINGLETON;
  }
}
