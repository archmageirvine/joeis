package irvine.oeis.a036;

import irvine.math.cr.CR;

/**
 * A036416 Number of empty intervals when fractional_part(i*Pi) for i = 1, ..., n is plotted along [ 0, 1 ] subdivided into n equal regions.
 * @author Sean A. Irvine
 */
public class A036416 extends A036412 {

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
