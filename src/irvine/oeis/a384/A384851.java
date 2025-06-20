package irvine.oeis.a384;

import irvine.math.cr.CR;
import irvine.math.cr.ZPolynomialFunction;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A384851 Decimal expansion of minimal radius of a circle that contains 14 non-overlapping unit disks.
 * @author Sean A. Irvine
 */
public class A384851 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A384851() {
    super(1, new ZPolynomialFunction(Polynomial.create(49, -4346, 172311, -4134492, 66647843, -759438450, 6295485573L, -38557290064L, 175537055738L, -593729401364L, 1486108072662L, -2743990597288L, 3734397946902L, -3746579404052L, 2767422383674L, -1498751280720L, 591369611109L, -168736166642L, 34449512067L, -4930771548L, 472689975, -27270266, 707281)).inverseMonotone(CR.TEN, CR.valueOf(11)).execute(CR.ZERO).add(1).sqrt().add(1));
  }
}
