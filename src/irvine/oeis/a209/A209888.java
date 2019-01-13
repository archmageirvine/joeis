package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209888.
 * @author Sean A. Irvine
 */
public class A209888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209888() {
    super(new long[] {-1, 2, -1, 0, 2}, new long[] {1, 2, 4, 8, 16});
  }
}
