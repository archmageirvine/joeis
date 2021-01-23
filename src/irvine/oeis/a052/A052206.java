package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052206 Partial sums of A050405.
 * @author Sean A. Irvine
 */
public class A052206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052206() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 16, 100, 408, 1290, 3432, 8052, 17160});
  }
}
