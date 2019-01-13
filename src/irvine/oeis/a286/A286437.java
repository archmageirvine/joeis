package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286437.
 * @author Sean A. Irvine
 */
public class A286437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286437() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 9, 48, 153, 372});
  }
}
