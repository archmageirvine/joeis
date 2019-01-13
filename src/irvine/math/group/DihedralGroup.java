package irvine.math.group;

import java.util.Arrays;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;

/**
 * The dihedral groups.
 * @author Sean A. Irvine
 */
public class DihedralGroup extends Generator<Permutation<Integer>> {

  private static final Q QUARTER = Q.ONE_QUARTER;

  private static FiniteSet<Permutation<Integer>> getGenerators(final int n) {
    final int[] pa = new int[n];
    final int[] pb = new int[n];
    for (int k = 0; k < n; ++k) {
      pa[k] = 1 + (k + 1) % n;
      pb[k] = n - k;
    }
    final Permutation<Integer> genA = Permutation.create(pa);
    final Permutation<Integer> genB = Permutation.create(pb);
    return new FiniteSet<>(Arrays.asList(genA, genB));
  }

  /**
   * Return the cycle index of <code>D_n</code>.
   * @param n index
   * @return cycle index
   */
  public static CycleIndex cycleIndex(final int n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    final CycleIndex cn = new CyclicGroup(n).cycleIndex();
    final String name = "Z(D" + n + ")";
    final CycleIndex dn = new CycleIndex(name);
    for (final MultivariateMonomial p : cn.values()) {
      final MultivariateMonomial copy = p.copy(); // use a copy to avoid damaging cn
      copy.multiply(Q.HALF);
      dn.add(copy);
    }
    if ((n & 1) == 0) {
      final MultivariateMonomial m1 = new MultivariateMonomial();
      m1.add(1, 2);
      m1.add(2, (n - 2) / 2);
      m1.setCoefficient(QUARTER);
      dn.add(m1);
      final MultivariateMonomial m2 = new MultivariateMonomial();
      m2.add(2, n / 2);
      m2.setCoefficient(QUARTER);
      dn.add(m2);
    } else {
      final MultivariateMonomial m1 = new MultivariateMonomial();
      m1.add(1, 1);
      m1.add(2, (n - 1) / 2);
      m1.setCoefficient(Q.HALF);
      dn.add(m1);
    }
    return dn;
  }

  /**
   * Print cycle index.
   *
   * @param args cycle index to print.
   */
  public static void main(final String[] args) {
    System.out.println(cycleIndex(Integer.parseInt(args[0])));
  }


  /**
   * Create the dihedral group of specified index
   * @param n index of group
   */
  public DihedralGroup(final int n) {
    super(SymmetricGroup.create(n), getGenerators(n), false);
  }

  @Override
  public CycleIndex cycleIndex() {
    return cycleIndex(size().divide2().intValueExact());
  }

  @Override
  public String toString() {
    return "D_{" + size().divide2() + "}";
  }
}
