package irvine.oeis.a055;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.HolonomicRecurrence;

/**
 * A055350 Number of labeled mobiles (circular rooted trees) with n nodes and 3 leaves.
 * @author Georg Fischer
 */
public class A055350 extends HolonomicRecurrence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A055350() {
    super(4, A055350.computeRecurrence(3), "8, 220, 4200, 71400, 1176000, 19474560");
    setGfType(1);
  }

  /**
   * Compute the recurrence matrix.
   * @param n number of leaves of the trees
   * @return a nested string suitable for {@link HolonomicRecurrence}
   */
  protected static String computeRecurrence(final int n) {
    final StringBuilder sb = new StringBuilder();
    sb.append("[[0");
    final Polynomial<Z> prod = RING.pow(Polynomial.create(-1, 1), 3L * n);
    for (int k = 0; k <= prod.degree(); ++k) {
      sb.append("],[");
      sb.append(prod.coeff(k));
    }
    sb.append("]]");
    return sb.toString();
  }
}
