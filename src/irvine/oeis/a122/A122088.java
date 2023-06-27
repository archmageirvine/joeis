package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122088 Add 10, subtract 5, add 10, subtract 5, ad infinitum.
 * @author Sean A. Irvine
 */
public class A122088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122088() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 11, 6});
  }
}
