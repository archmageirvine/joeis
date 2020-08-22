package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017642 (12n+10)^2.
 * @author Sean A. Irvine
 */
public class A017642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017642() {
    super(new long[] {1, -3, 3}, new long[] {100, 484, 1156});
  }
}
