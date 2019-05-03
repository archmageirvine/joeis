package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188497 <code>a(n) = A188493(n+1) - A188491(n) - A188495(n)</code>.
 * @author Sean A. Irvine
 */
public class A188497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188497() {
    super(new long[] {1, 2, 0, 2, 4, -2, -10, -16, -2, 8, 10, 0, 2, 2}, new long[] {0, 0, 2, 4, 7, 20, 72, 240, 722, 2140, 6508, 20077, 61776, 189056});
  }
}
