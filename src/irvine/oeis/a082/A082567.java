package irvine.oeis.a082;

import java.util.ArrayList;
import java.util.List;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A082567 Palindromic time display in hours, minutes, seconds on a six spaced 24-hour digital clock, using hours 1-24.
 * @author Sean A. Irvine
 */
public class A082567 extends FiniteSequence {

  private static List<Z> build() {
    final ArrayList<Z> res = new ArrayList<>();
    for (int h = 1; h <= 24; ++h) {
      for (int m = 0; m < 60; ++m) {
        for (int s = 0; s < 60; ++s) {
          final int t = 10000 * h + 100 * m + s;
          if (Predicates.PALINDROME.is(t)) {
            res.add(Z.valueOf(t));
          }
        }
      }
    }
    return res;
  }

  /** Construct the sequence. */
  public A082567() {
    super(1, FINITE, build());
  }
}
