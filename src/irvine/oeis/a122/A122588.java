package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122588.
 * @author Sean A. Irvine
 */
public class A122588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122588() {
    super(new long[] {1, -15, 35, -28, 9}, new long[] {1, 9, 53, 260, 1156});
  }
}
