package irvine.oeis.a068;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068595 Number of functions from {1,2,...,n} to {1,2,...,n} such that the sum of the function values is 0 mod 3.
 * @author Sean A. Irvine
 */
public class A068595 extends Sequence1 {

  private int mN = 0;

  private boolean bump(final int[] v, final int max) {
    for (int k = v.length - 1; k >= 0; --k) {
      if (++v[k] <= max) {
        for (int j = k + 1; j < v.length; ++j) {
          v[j] = v[k];
        }
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    // Construct all possible length n vectors with elements 1..n and elements in increasing order
    // Test if sum is 0 mod 3.
    // Multiply up by the number of arrangements of those elements.
    ++mN;
    Z sum = Z.ZERO;
    final int[] v = new int[mN];
    final int[] c = new int[v.length + 1];
    Arrays.fill(v, 1);
    do {
      if (Functions.SUM.l(v) % 3 == 0) {
        IntegerPartition.toCountForm(v, c);
        sum = sum.add(Binomial.multinomial(mN, c));
      }
    } while (bump(v, mN));
    return sum;
  }
}
