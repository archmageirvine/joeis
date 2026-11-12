package irvine.oeis.a122;

import java.util.ArrayList;
import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A122987 Possible last three digits of n^3 (leading zeros omitted).
 * @author Georg Fischer
 */
public class A122987 extends FiniteSequence {

  private static Z[] build(final int width, final Function<Integer, Integer> lambda) {
    final ArrayList<Z> list = new ArrayList<>(width);
    final int[] poss = new int[width];
    for (int k = 0; k < width; ++k) {
      poss[k] = -1;
    }
    for (int k = 0; k < width; ++k) {
      final int m = lambda.apply(k);
      poss[m] = m;
    }
    for (int k = 0; k < width; ++k) {
      if (poss[k] >= 0) {
        list.add(Z.valueOf(k));
      }
    }
    return list.toArray(Z[]::new);
  }


  /** Construct the sequence. */
  public A122987() {
    this(1, 1000, k -> (k * k * k) % 1000);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param width corresponds with the number of trailing digits
   * @param lambda the expression to be checked for trailing digits
   */
  public A122987(final int offset, final int width, final Function<Integer, Integer> lambda) {
    super(offset, FINITE, build(width, lambda));
  }

}
