package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122194.
 * @author Sean A. Irvine
 */
public class A122194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122194() {
    super(new long[] {-1, 1, -1, 1, 1}, new long[] {3, 5, 6, 9, 10});
  }
}
