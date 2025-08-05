package irvine.oeis.a079;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A079212 Numbers n in which the last k digits of n form an integer divisible by the k-th prime, for k = 1, 2, ..., m, where m is the number of digits in n.
 * @author Sean A. Irvine
 */
public class A079212 extends FiniteSequence {

  private static Collection<Z> build() {
    final TreeSet<Z> res = new TreeSet<>();
    res.add(Z.ZERO);
    search(res, 0, 1, 1);
    return res;
  }

  private static void search(final TreeSet<Z> res, final long v, final long m, final long q) {
    if (m > 10000000) {
      return;
    }
    final long p = Functions.NEXT_PRIME.l(q);
    for (long d = 0; d < 10; ++d) {
      final long w = v + d * m;
      if (w % p == 0) {
        if (d != 0) {
          res.add(Z.valueOf(w));
        }
        search(res, w, m * 10, p);
      }
    }
  }

  /** Construct the sequence. */
  public A079212() {
    super(1, FINITE, build());
  }
}
