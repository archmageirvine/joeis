package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095266.
 * @author Sean A. Irvine
 */
public class A095266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095266() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 42, 303, 1144, 3105});
  }
}
