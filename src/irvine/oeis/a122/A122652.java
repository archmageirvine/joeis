package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122652.
 * @author Sean A. Irvine
 */
public class A122652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122652() {
    super(new long[] {-1, 10}, new long[] {0, 4});
  }
}
