package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.oeis.cons.FactorialExpansionSequence;

/**
 * A067882 Factorial expansion of log(2) = Sum_{n&gt;=1} a(n)/n!.
 * @author Sean A. Irvine
 */
public class A067882 extends FactorialExpansionSequence {

  /** Construct the sequence. */
  public A067882() {
    super(1, CR.LOG2);
  }
}
