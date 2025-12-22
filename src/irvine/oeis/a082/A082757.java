package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.util.Permutation;

/**
 * A082757 Possible integer ratios of A/B, where A and B have no 0 in their decimal representation, all decimal digits of A and B are different and each digit is used only once.
 * @author Sean A. Irvine
 */
public class A082757 extends FiniteSequence {

  private static TreeSet<Z> build() {
    final TreeSet<Z> res = new TreeSet<>();
    final Permutation perm = new Permutation(IntegerUtils.identity1(new int[9]));
    int[] p;
    while ((p = perm.next()) != null) {
      for (int k = 5; k <= 8; ++k) {
        long num = 0;
        for (int j = 0; j < k; ++j) {
          num *= 10;
          num += p[j];
        }
        long den = 0;
        for (int j = k; j < p.length; ++j) {
          den *= 10;
          den += p[j];
        }
        if (num % den == 0) {
          res.add(Z.valueOf(num / den));
        }
      }
    }
    return res;
  }

  /** Construct the sequence. */
  public A082757() {
    super(1, FINITE, build());
  }
}
