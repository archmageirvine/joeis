package irvine.oeis.a391;
// manually equa/decexp at 2025-12-18 12:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A391665 Decimal expansion of Sum_{k&gt;=1} k * zeta(2*k) * Fibonacci(2*k) / 5^k.
 * @author Georg Fischer
 */
public class A391665 extends DecimalExpansionSequence {

  private static final CR C = CR.PI.divide(CR.TWO.multiply(CR.FIVE.sqrt()));

  /** Construct the sequence */
  public A391665() {
    super(1, C.tan().multiply(C).divide(2).add(C.divide(C.cos()).square()));
  }
}
