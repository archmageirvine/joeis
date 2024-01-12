package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.oeis.cons.FactorialExpansionSequence;

/**
 * A067881 Factorial expansion of sqrt(3) = Sum_{n&gt;=1} a(n)/n!.
 * @author Sean A. Irvine
 */
public class A067881 extends FactorialExpansionSequence {

  /** Construct the sequence. */
  public A067881() {
    super(1, CR.THREE.sqrt());
  }
}
