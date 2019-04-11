package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122983 <code>a(n) = (2 + (-1)^n + 3^n)/4</code>.
 * @author Sean A. Irvine
 */
public class A122983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122983() {
    super(new long[] {-3, 1, 3}, new long[] {1, 1, 3});
  }
}
