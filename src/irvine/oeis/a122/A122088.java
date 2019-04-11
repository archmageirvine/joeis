package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122088 Add <code>10,</code> subtract <code>5,</code> add <code>10,</code> subtract <code>5,</code> ad infinitum.
 * @author Sean A. Irvine
 */
public class A122088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122088() {
    super(new long[] {-1, 1, 1}, new long[] {1, 11, 6});
  }
}
