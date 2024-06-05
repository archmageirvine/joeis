package irvine.oeis.a336;

import irvine.math.function.Functions;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A336810 Continued fraction expansion of Sum_{k&gt;=0} 1/(k!)!.
 * @author Georg Fischer
 */
public class A336810 extends FoldedContinuedFraction {

  /** Construct the sequence. */
  public A336810() {
    super(0, k -> Functions.FACTORIAL.z(Functions.FACTORIAL.z(k + 3))
        .divide(Functions.FACTORIAL.z(Functions.FACTORIAL.z(k + 2)).square())
        , 2, 1, 1, 179, 2);
  }
}
