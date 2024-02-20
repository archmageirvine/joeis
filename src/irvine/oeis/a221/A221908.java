package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221908 a(n) = 6^n + 6*n.
 * @author Sean A. Irvine
 */
public class A221908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221908() {
    super(new long[] {6, -13, 8}, new long[] {1, 12, 48});
  }
}
