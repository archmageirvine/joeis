package irvine.oeis.a302;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A302390 Triameter of the n-cube-connected cycle graph.
 * @author Georg Fischer
 */
public class A302390 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A302390() {
    super(3, "[[0],[-1],[1],[1],[-1]]", "13, 20, 25, 32, 36, 44", 0);
  }
}
