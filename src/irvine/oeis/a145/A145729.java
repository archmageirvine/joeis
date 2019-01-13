package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145729.
 * @author Sean A. Irvine
 */
public class A145729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145729() {
    super(new long[] {8, -17, 10}, new long[] {0, 8, 80});
  }
}
