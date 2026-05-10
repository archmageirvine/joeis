package irvine.oeis.a395;

import irvine.oeis.gf.EgfSequence;

/**
 * A395672 Number of endofunctions f:{1,2,...,n}-&gt; {1,2,...,n} whose smallest weakly connected component has exactly 3 nodes.
 * @author Sean A. Irvine
 */
public class A395672 extends EgfSequence {

  /** Construct the sequence. */
  public A395672() {
    super(0, "exp(-(x+(3/2)*x^2))*(1-exp(-(17/6)*x^3)) / (1+LambertW(-x))");
  }
}
