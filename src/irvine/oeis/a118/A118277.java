package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118277 Generalized <code>9-gonal (or enneagonal)</code> numbers: <code>m*(7*m - 5)/2</code> with m <code>= 0, 1, -1, 2, -2, 3, -3</code>, ...
 * @author Sean A. Irvine
 */
public class A118277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118277() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 6, 9, 19});
  }
}
