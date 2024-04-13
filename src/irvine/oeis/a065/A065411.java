package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000045;

/**
 * A065411 Fibonacci numbers whose digits sum to a square.
 * @author Sean A. Irvine
 */
public class A065411 extends FilterSequence {

  /** Construct the sequence. */
  public A065411() {
    // Contortions to drop the repeated 1
    super(1, new PrependSequence(new A000045().skip(2), 0), k -> LongUtils.isSquare(Functions.DIGIT_SUM.l(k)));
  }
}
