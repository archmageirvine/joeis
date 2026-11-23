package irvine.math.turing;

import java.util.Arrays;

import irvine.math.turing.FractranMacro.Affine;

import static irvine.math.turing.FractranMacro.A;
import static irvine.math.turing.FractranMacro.K;
import static irvine.math.turing.FractranMacro.ZERO;
import static irvine.math.turing.FractranMacro.constant;
import static irvine.math.turing.FractranMacro.require;

/**
 * Checks explicit recurrent counter blocks for difficult size-21 FRACTRAN cases.
 * @author Gregory Morse
 */
public final class FractranMacroWitness {

  private FractranMacroWitness() {
  }

  private static FractranMacro bootstrap(final int[][] rules, final int length) {
    final FractranMacro t = new FractranMacro(rules, constant(1), ZERO, ZERO, ZERO, ZERO);
    t.advance(length);
    return t;
  }

  private static void zeroOutside(final FractranMacro t, final int variable) {
    for (int i = 1; i < 5; ++i) {
      if (i != variable) {
        t.zeros(i);
      }
    }
  }

  private static void region(final FractranMacro t, final int variable, final int scale, final int minimum) {
    zeroOutside(t, variable);
    require(t.get(variable).atLeast(minimum) && t.get(0).multiply(scale).add(t.get(variable).multiply(-1)).atLeast(1),
      "Did not return to the inductive region");
  }

  private static void box(final FractranMacro t, final int variable, final int left, final int right) {
    zeroOutside(t, variable);
    require(t.get(0).atLeast(left) && t.get(variable).atLeast(right), "Did not return to the inductive box");
  }

  private static void verify100() {
    final int[][] f = {{0, -1, -1, 1, 0}, {1, -1, 0, 0, 1}, {0, 3, 0, -1, -1}, {0, 0, 1, 0, -1}, {-1, 1, 0, 0, 1}};
    region(bootstrap(f, 14), 4, 1, 4);
    // E >= 4 is exactly the union E = 4*k+4+r, with 0 <= r < 4.
    for (int r = 0; r < 4; ++r) {
      final Affine e = K.multiply(4).add(4 + r);
      final FractranMacro t = new FractranMacro(f, A.add(e).add(1), ZERO, ZERO, ZERO, e);
      t.repeat(e, 3);
      t.repeat(K.add(1), 4, 0, 2, 0, 0, 0);
      t.advance(r == 0 ? 2 : 6);
      t.repeat(t.get(3), 2, 1, 1, 1);
      region(t, 4, 1, 4);
    }
    passed(100, f);
  }

  private static void verify101and103(final boolean reorder) {
    final int[] fill = {1, -1, 0, 0, 2};
    final int[] drain = {0, 1, 0, -1, -1};
    final int[][] f = {{0, -1, -1, 1, 0}, reorder ? drain : fill, reorder ? fill : drain, {0, 0, 1, 0, -1}, {-1, 2, 0, 1, 0}};
    region(bootstrap(f, 5), 4, 2, 2);
    for (int r = 0; r < 2; ++r) {
      for (int parity = 0; parity < 2; ++parity) {
        final Affine n = K.multiply(2).add(1 + parity);
        final Affine e = n.multiply(2).add(r);
        final FractranMacro t = new FractranMacro(f, A.add(n).add(1), ZERO, ZERO, ZERO, e);
        t.repeat(e, 3);
        t.repeat(n, 4, 0, 0);
        if (reorder) {
          t.advance(r == 0 ? 1 : 2);
          final int dOdd = (3 * (1 + parity) + 1 + r) & 1;
          t.repeat(t.get(3).floorDivide(2), 2, 1, 1);
          t.advance(2 * dOdd);
          t.repeat(t.get(1), 2);
        } else {
          t.advance(1);
          t.advance(2);
          t.repeat(t.get(3), 2, 1);
        }
        region(t, 4, 2, 2);
      }
    }
    passed(reorder ? 103 : 101, f);
  }

  private static void verify12() {
    final int[][] f = {{0, -2, -1, 0, 0}, {1, 0, -1, 2, 0}, {0, 0, 2, -1, -1}, {0, 1, 0, -1, 0}, {-1, 0, 1, 0, 1}};
    region(bootstrap(f, 10), 1, 2, 5);
    for (int r = 0; r < 2; ++r) {
      final Affine k = K.add(3 - r);
      final Affine b = k.multiply(2).add(r);
      final FractranMacro t = new FractranMacro(f, A.add(k).add(1), b, ZERO, ZERO, ZERO);
      t.repeat(k, 4, 0);
      t.advance(2);
      t.repeat(t.get(4), 2, 1, 1);
      t.repeat(t.get(3), 3);
      region(t, 1, 2, 5);
    }
    passed(12, f);
  }

  private static void verify4() {
    final int[][] f = {{0, -1, -1, 0, 0}, {1, -1, 0, 2, 0}, {0, 2, 0, -1, -1}, {0, 0, 1, -2, 0}, {-1, 1, 0, 0, 1}};
    box(bootstrap(f, 15), 4, 2, 1);
    for (int r = 1; r <= 2; ++r) {
      final FractranMacro t = new FractranMacro(f, A.add(2), ZERO, ZERO, ZERO, K.multiply(2).add(r));
      t.advance(5);
      t.repeat(t.get(4), 2, 1, 1);
      t.repeat(t.get(3).floorDivide(2), 3);
      if (r == 2) {
        t.advance(5);
      }
      t.repeat(t.get(2), 4, 0);
      box(t, 4, 2, 1);
    }
    passed(4, f);
  }

  private static void verify5and6(final boolean variant) {
    final int[] last = variant ? new int[] {-1, 2, 0, 0, 1} : new int[] {-1, 0, 0, 1, 2};
    final int[][] f = {{0, -1, -1, 0, 0}, {1, -1, 0, 2, 0}, {0, 2, 0, -1, -1}, {0, 0, 1, -1, 0}, last};
    region(bootstrap(f, variant ? 6 : 7), 3, 2, 1);
    // d=1 is the only branch in which floor(d/2) vanishes.
    for (int branch = 0; branch < 3; ++branch) {
      final Affine k = branch == 0 ? ZERO : K.add(1);
      final int r = branch == 2 ? 0 : 1;
      final Affine d = k.multiply(2).add(r);
      final FractranMacro t = new FractranMacro(f, A.add(k).add(1), ZERO, ZERO, d, ZERO);
      t.repeat(d, 3);
      if (variant) {
        t.repeat(k, 4, 0, 0);
        t.advance(3);
      } else {
        t.repeat(k, 4, 2, 0, 0);
        t.advance(r == 0 ? 1 : 4);
      }
      t.repeat(t.get(4), 2, 1, 1);
      region(t, 3, 2, 1);
    }
    passed(variant ? 6 : 5, f);
  }

  private static void passed(final int sourceId, final int[][] table) {
    System.out.println("proved " + sourceId + ' ' + Arrays.deepToString(table));
  }

  /**
   * Replay the symbolic certificates from the transition tables.
   * @param args ignored
   */
  public static void main(final String[] args) {
    verify100();
    verify101and103(false);
    verify101and103(true);
    verify12();
    verify4();
    verify5and6(false);
    verify5and6(true);
  }
}
