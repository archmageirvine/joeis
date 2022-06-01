package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228470 a(n) = 6*a(n-2) + a(n-4), where a(0) = 3, a(1) = 11, a(2) = 18, a(3) = 68.
 * @author Sean A. Irvine
 */
public class A228470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228470() {
    super(new long[] {1, 0, 6, 0}, new long[] {3, 11, 18, 68});
  }
}
