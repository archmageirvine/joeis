package irvine.oeis.a052;
// manually 2021-11-05

import irvine.oeis.HolonomicRecurrence;

/**
 * A052708 A simple context-free grammar.
 * @author Georg Fischer
 */

public class A052708 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A052708() {
    super(0, "[[0]],[-576,-1920, 3072, 6144],[-9096,-30320,-28032,-7936],[20808, 41380, 28032, 6272],[-45600,-60704,-26520,-3784],[14136, 15314, 5301, 589]]", "[0, 0, 1, 2, 5]", 4);
  }
}
