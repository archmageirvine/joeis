package irvine.oeis.a394;

import irvine.math.graph.LabeledReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A394955 Number of reducible flow graphs on n labeled nodes whose entry node 1 is a global source (in-degree 0, reaches every node).
 * @author Gregory Morse
 */
public class A394955 extends CachedSequence {

  /** Construct the sequence. */
  public A394955() {
    super(1, Integer.class, new LabeledReducibleDigraphs()::singleSource);
  }
}
