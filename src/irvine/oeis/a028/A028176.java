package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028176.
 * @author Sean A. Irvine
 */
public class A028176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028176() {
    super(new long[] {-3240, 1818, -369, 32}, new long[] {1, 32, 655, 10970});
  }
}
