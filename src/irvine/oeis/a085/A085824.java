package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a037.A037053;

/**
 * A085824 Numbers n such that the smallest prime containing exactly n 0's (A037053) requires only two nonzero digits.
 * @author Sean A. Irvine
 */
public class A085824 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A085824() {
    super(1, 0, new A037053(), k -> {
      final int[] cnts = ZUtils.digitCounts(k);
      cnts[0] = 0;
      return Functions.SUM.i(cnts) == 2;
    });
  }
}
