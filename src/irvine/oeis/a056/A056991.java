package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056991 Numbers with digital root 1, 4, 7 or 9.
 * @author Sean A. Irvine
 */
public class A056991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056991() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 4, 7, 9, 10});
  }
}
