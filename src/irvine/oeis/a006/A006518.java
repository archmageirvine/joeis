package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.oeis.a084.A084119;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A006518 Continued fraction for Sum_{k &gt;= 2} 2^(-Fibonacci(k)).
 * @author Sean A. Irvine
 */
public class A006518 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A006518() {
    super(0, new DecimalExpansionSequence(new A084119().getCR().subtract(CR.HALF)));
  }
}
