package irvine.oeis.a264;
// manually 2026-06-04

import irvine.oeis.recur.GeneratingFunctionSequence;
import irvine.oeis.transform.EulerTransform;


/**
 * A264926 G.f.: 1 / Product_{n&gt;=0} (1 - x^(n+6))^((n+1)*(n+2)*(n+3)*(n+4)*(n+5)/5!).
 * @author Georg Fischer
 */
public class A264926 extends EulerTransform {

  /** Construct the sequence. */
  public A264926() {
    super(new GeneratingFunctionSequence(0, "[0, 0, 0, 0, 0, 1]", "[1,-6, 15, -20, 15, -6, 1]"), 1);
  }
}
