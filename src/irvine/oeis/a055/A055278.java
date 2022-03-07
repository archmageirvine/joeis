package irvine.oeis.a055;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.HolonomicRecurrence;

/**
 * A055278 Number of rooted trees with n nodes and 3 leaves.
 * @author Georg Fischer
 */
public class A055278 extends HolonomicRecurrence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A055278() {
    super(4, A055278.computeRecurrence(3), "1, 3, 8, 18", 0);
  }

  /**
   * Compute the recurrence matrix.
   * @param n number of leaves of the trees
   * @return a nested string suitable for {@link HolonomicRecurrence}
   */
  protected static String computeRecurrence(final int n) {
    final StringBuilder sb = new StringBuilder();
    sb.append("[[0");
    Polynomial<Z> prod = Polynomial.create(1);
    for (int k = 1; k <= n; ++k) {
      int expon = n / k;
      prod = RING.multiply(prod, RING.pow(RING.subtract(RING.pow(RING.x(), k), RING.one()), expon), 1024);
    }
    for (int k = 0; k <= prod.degree(); ++k) {
      sb.append("],[");
      sb.append(prod.coeff(k).toString());
    }
    sb.append("]]");
    //System.out.println(sb.toString());
    return sb.toString();
  }
}
