package irvine.oeis.a055;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055357 Number of increasing mobiles (circular rooted trees) with n nodes and 3 leaves.
 * @author Georg Fischer
 */
public class A055357 extends HolonomicRecurrence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A055357() {
    super(4, A055357.computeRecurrence(3), "2, 18, 98, 424, 1614, 5682");
  }

  /**
   * Compute the recurrence matrix.
   * @param n number of leaves of the trees
   * @return a nested string suitable for {@link HolonomicRecurrence},
   * for </code>(3*x-1)*(-1+2*x)^2*(x-1)^3</code>
   */
  protected static String computeRecurrence(final int n) {
    final StringBuilder sb = new StringBuilder();
    sb.append("[[0");
    Polynomial<Z> prod = Polynomial.create(1);
    for (int k = 1; k <= n; ++k) {
      prod = RING.multiply(prod, RING.pow(Polynomial.create(-1, n + 1 - k), k), 1024);
    }
    for (int k = prod.degree(); k >= 0; --k) {
      sb.append("],[");
      sb.append(prod.coeff(k));
    }
    sb.append("]]");
    // System.out.println(sb.toString() + " =^= " + prod.toString());
    return sb.toString();
  }
}
