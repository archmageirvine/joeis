package irvine.oeis.a046;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a014.A014553;
import irvine.util.Permutation;
import irvine.util.string.StringUtils;

/**
 * A046150 Largest n-digit number with maximal multiplicative persistence A014553.
 * @author Sean A. Irvine
 */
public class A046150 extends A014553 {

  // Cf. A046148.
  // Note because there are no numbers with multiplicative persistence > 10 below 10^233,
  // terms from n>=15 to n<=233 are predictable, but the following is a genuine effort
  // to compute them.

  private int mN = 0;

  @Override
  public Z next() {
    final long mxper = super.next().longValueExact() - 1;
    if (++mN == 1) {
      return Z.NINE;
    }
    Z max = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(mN);
    int[] p;
    while ((p = part.next()) != null) {
      if (p.length <= 9) {
        final Permutation perm = new Permutation(Arrays.copyOf(p, 9));
        int[] q;
        while ((q = perm.next()) != null) {
          Z prod = Z.ONE;
          for (int k = 0; k < q.length; ++k) {
            prod = prod.multiply(Z.valueOf(k + 1).pow(q[k]));
          }
          if (ZUtils.multiplicativePersistence(prod) == mxper) {
            final StringBuilder sb = new StringBuilder();
            for (int k = 0; k < q.length; ++k) {
              sb.append(StringUtils.rep((char) ('1' + k), q[k]));
            }
            max = max.max(Functions.DIGIT_SORT_DESCENDING.z(new Z(sb)));
          }
        }
      }
    }
    return max;
  }
}
