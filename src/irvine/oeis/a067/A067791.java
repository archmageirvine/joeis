package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;
import irvine.util.array.DynamicLongArray;

/**
 * A067791 Smallest multidigit prime such that the sum of the squares of its digits is equal to n times the product of its digits, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A067791 extends Sequence1 {

  // No known term needs this value > 3
  private static final int HEURISTIC_MAX_NON_ONE_DIGITS = 15;
  private long mN = 0;

  // Builds the sets of digits that satisfy mN * product of digits <= sum of squares of digits
  private void build(final List<List<Integer>> lst, final DynamicLongArray products, final DynamicLongArray sums, final List<Integer> cur, final long prod, final long sum, final int prev) {
    if (sum <= prod) {
      products.set(lst.size(), prod);
      sums.set(lst.size(), sum);
      lst.add(new ArrayList<>(cur));
    }
    if (cur.size() < HEURISTIC_MAX_NON_ONE_DIGITS) {
      for (int digit = prev; digit <= 9; ++digit) {
        cur.add(digit);
        build(lst, products, sums, cur, prod * digit, sum + (long) digit * digit, digit);
        cur.remove(cur.size() - 1);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final List<List<Integer>> seeds = new ArrayList<>();
    final DynamicLongArray products = new DynamicLongArray();
    final DynamicLongArray sums = new DynamicLongArray();
    build(seeds, products, sums, new ArrayList<>(), mN, 0, 2);
    Z best = null;
    int bestLength = Integer.MAX_VALUE;
    for (int k = 0; k < seeds.size(); ++k) {
      // Work out the number of 1s need to make the sum and product equal
      final long ones = products.get(k) - sums.get(k);
      if (ones > Integer.MAX_VALUE) {
        continue;
      }
      final List<Integer> nontrivial = seeds.get(k);
      final int length = (int) ones + nontrivial.size();
      if (length > 1 && length <= bestLength) {
        final int[] t = new int[length];
        Arrays.fill(t, 1);
        for (int j = 0; j < nontrivial.size(); ++j) {
          t[j] = nontrivial.get(j);
        }
        // Generate permutations of the set of digits (including the 1s) in increasing order
        final Permutation perm = new Permutation(t);
        int[] p;
        while ((p = perm.next()) != null) {
          final Z z = Permutation.permToZ(p);
          if (best != null && z.compareTo(best) >= 0) {
            break;
          }
          if (z.isProbablePrime()) {
            best = z;
            bestLength = best.toString().length();
          }
        }
      }
    }
    return best;
  }
}
