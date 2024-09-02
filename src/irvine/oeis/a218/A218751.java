package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218751 a(n) = (48^n - 1)/47.
 * @author Sean A. Irvine
 */
public class A218751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218751() {
    super(new long[] {-48, 49}, new long[] {0, 1});
  }
}
