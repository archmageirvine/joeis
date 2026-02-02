package irvine.oeis.a083;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A083512 Multiples of 11 with digit sum 11, with no zero digits in odd places.
 * @author Sean A. Irvine
 */
public class A083512 extends FiniteSequence {

  private static void search(final Collection<Z> res, final Z n, final int sum) {
    if (sum == 11) {
      if (n.mod(11) == 0) {
        res.add(n);
      }
      return;
    }
    final Z m = n.multiply(100);
    for (int k = 1; k + sum <= 11 && k < 10; ++k) {
      search(res, m.add(k), sum + k);
    }
  }

  private static Collection<Z> build() {
    final TreeSet<Z> res = new TreeSet<>();
    search(res, Z.ZERO, 0);
    return res;
  }

  /** Construct the sequence. */
  public A083512() {
    super(1, FINITE, build());
  }
}

