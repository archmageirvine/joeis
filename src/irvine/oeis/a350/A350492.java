package irvine.oeis.a350;

import irvine.math.graph.UnlabeledAcyclicDigraphs.Kind;

/**
 * A350492 Number of unlabeled acyclic digraphs with n arcs and a global source and sink.
 * @author Gregory Morse
 */
public class A350492 extends A350490 {
  /** Construct the sequence. */
  public A350492() {
    super(Kind.SOURCE_SINK);
  }
}
