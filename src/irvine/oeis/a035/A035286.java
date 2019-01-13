package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035286.
 * @author Sean A. Irvine
 */
public class A035286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035286() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 32, 156, 456});
  }
}
