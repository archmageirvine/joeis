package irvine.oeis.a005;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005747 Number of n-covers of a 6-set.
 * @author Sean A. Irvine
 */
public class A005747 implements Sequence {

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();

  /**
   * Compute the number of k-covers of an n-set
   * @param n set size
   * @param k cover size
   * @return number of k-covers of n-set
   */
  public static Z covers(final int n, final int k) {
    final IntegerPartition alphaPartitions = new IntegerPartition(n);
    int[] alpha;
    final int[] alphaCntForm = new int[n + 1];
    final int[] betaCntForm = new int[k + 1];
    Z sum = Z.ZERO;
    while ((alpha = alphaPartitions.next()) != null) {
      IntegerPartition.toCountForm(alpha, alphaCntForm);
      final Z ordAlpha = FACTORIAL.factorial(n).divide(SymmetricGroup.per(alphaCntForm));
      final IntegerPartition betaPartitions = new IntegerPartition(k);
      int[] beta;
      while ((beta = betaPartitions.next()) != null) {
        IntegerPartition.toCountForm(beta, betaCntForm);
        final Z ordBeta = FACTORIAL.factorial(k).divide(SymmetricGroup.per(betaCntForm));
        Z prod = Z.ONE;
        for (int a : alpha) {
          int power = 0;
          for (int b : beta) {
            power += IntegerUtils.gcd(a, b);
          }
          prod = prod.multiply(Z.ONE.shiftLeft(power).subtract(1));
        }
        sum = sum.add(ordAlpha.multiply(ordBeta).multiply(prod));
      }
    }
    return sum.divide(FACTORIAL.factorial(n)).divide(FACTORIAL.factorial(k));
  }

  private int mN = 0;

  @Override
  public Z next() {
    return covers(6, ++mN);
  }
}
