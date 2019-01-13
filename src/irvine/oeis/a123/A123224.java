package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123224.
 * @author Sean A. Irvine
 */
public class A123224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123224() {
    super(new long[] {-1, 15, -28, 15}, new long[] {1, 4, 35, 428});
  }
}
