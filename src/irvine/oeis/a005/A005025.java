package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005025 Random walks.
 * @author Sean A. Irvine
 */
public class A005025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005025() {
    super(new long[] {1, -15, 35, -28, 9}, new long[] {9, 53, 260, 1156, 4845});
  }
}

