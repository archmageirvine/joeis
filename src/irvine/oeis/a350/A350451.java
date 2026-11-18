package irvine.oeis.a350;

import irvine.math.graph.UnlabeledAcyclicDigraphs.Kind;

/**
 * A350451 Number of weakly connected acyclic digraphs with n arcs.
 * @author Gregory Morse
 */
public class A350451 extends A350490 {
  /** Construct the sequence. */
  public A350451() {
    super(Kind.CONNECTED);
  }
}
