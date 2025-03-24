package irvine.oeis.a379;
// manually 2025-03-23

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A379888 Decimal expansion of the surface area of a pentagonal hexecontahedron with unit shorter edge length.
 * Polynomial: 961*x^12 - 33925050*x^10 + 238487439375*x^8 - 374285139187500*x^6 + 215543322643359375*x^4 - 200764566730722656250*x^2 + 19088214930090087890625
 * @author Georg Fischer
 */
public class A379888 extends PolynomialRootExpansionSequence {

  /** Construct the sequence */
  public A379888() {
    super(3, Polynomial.create(new Z("19088214930090087890625"), Z.ZERO, new Z("-200764566730722656250"), Z.ZERO, new Z("215543322643359375"),
      Z.ZERO, new Z("-374285139187500"), Z.ZERO, new Z("238487439375"), Z.ZERO, new Z("-33925050"), Z.ZERO, new Z("961")), CR.valueOf(160), CR.valueOf(170));
  }
}
