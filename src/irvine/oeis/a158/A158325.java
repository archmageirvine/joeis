package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158325 <code>a(n) = 484n^2 + 2n</code>.
 * @author Sean A. Irvine
 */
public class A158325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158325() {
    super(new long[] {1, -3, 3}, new long[] {486, 1940, 4362});
  }
}
