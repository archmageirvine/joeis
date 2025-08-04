package irvine.oeis.a079;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A079206 Numbers n in which the first K digits of n form an integer divisible by the K-th prime, for K = 1, 2, ..., M, where M is the number of digits in n.
 * @author Sean A. Irvine
 */
public class A079206 extends FiniteSequence {

  private static Collection<Z> build() {
    final TreeSet<Z> res = new TreeSet<>();
    search(res, 0, 1);
    return res;
  }

  private static void search(final TreeSet<Z> res, final long v, final long q) {
    final long p = Functions.NEXT_PRIME.l(q);
    final long u = v * 10;
    for (long d = v == 0 ? 1 : 0; d < 10; ++d) {
      final long w = u + d;
      if (w % p == 0) {
        res.add(Z.valueOf(w));
        search(res, w, p);
      }
    }
  }

  /** Construct the sequence. */
  public A079206() {
    super(1, FINITE, build());
  }
}
