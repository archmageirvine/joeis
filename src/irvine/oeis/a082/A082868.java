package irvine.oeis.a082;

import irvine.oeis.a021.A021002;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A082868 Continued fraction approximation to Product_{k&gt;=2} zeta(k).
 * @author Sean A. Irvine
 */
public class A082868 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A082868() {
    super(0, new A021002());
  }
}
