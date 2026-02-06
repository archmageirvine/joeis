package irvine.oeis.a134;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A134970 Canyon numbers. Numbers with exactly one locally minimal digit and with exactly two locally maximal digits which are the same digit and nonadjacent.
 * @author Sean A. Irvine
 */
public class A134970 extends FiniteSequence {

  private static void build(final TreeSet<Z> res, final int max, final int prev, final Z val, final boolean minDone) {
    if (minDone && prev == max) {
      res.add(val);
      return;
    }
    if (minDone) {
      for (int d = prev + 1; d <= max; ++d) {
        build(res, max, d, val.multiply(10).add(d), true);
      }
    } else {
      for (int d = prev - 1; d >= 0; --d) {
        build(res, max, d, val.multiply(10).add(d), true);
        build(res, max, d, val.multiply(10).add(d), false);
      }
    }
  }

  private static Collection<Z> build() {
    final TreeSet<Z> res = new TreeSet<>();
    for (int max = 1; max < 10; ++max) {
      build(res, max, max, Z.valueOf(max), false);
    }
    return res;
  }

  /** Construct the sequence. */
  public A134970() {
    super(1, FINITE, build());
  }
}

