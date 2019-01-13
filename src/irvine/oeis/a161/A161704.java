package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161704.
 * @author Sean A. Irvine
 */
public class A161704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161704() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 2, 3, 6, 9, 18});
  }
}
