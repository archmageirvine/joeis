package irvine.oeis.a384;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A384744 Numbers in which all substrings in base 16 are primes.
 * @author Sean A. Irvine
 */
public class A384744 extends FiniteSequence {

  private static final long[] PRIMES = {2, 3, 5, 7, 11 /*B*/, 13 /*D*/};

  private static boolean is(final Z v) {
    Z mask = Z.valueOf(15);
    while (mask.compareTo(v) < 0) {
      mask = mask.shiftLeft(4).add(15);
      if (!v.and(mask).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  private static void search(final ArrayList<Z> lst, final Z v) {
    final Z u = v.shiftLeft(4); // * 16
    for (final long p : PRIMES) {
      final Z w = u.add(p);
      if (is(w)) {
        lst.add(w);
        search(lst, w);
      }
    }
  }

  private static List<Z> build() {
    final ArrayList<Z> lst = new ArrayList<>();
    search(lst, Z.ZERO);
    Collections.sort(lst);
    return lst;
  }

  /** Construct the sequence. */
  public A384744() {
    super(1, FINITE, build());
  }
}
