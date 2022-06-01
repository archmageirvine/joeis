package irvine.oeis.a225;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A225928 a(n) = 4*16^n + 8*4^n + 17.
 * @author Sean A. Irvine
 */
public class A225928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225928() {
    super(new long[] {64, -84, 21}, new long[] {29, 113, 1169});
  }
}
