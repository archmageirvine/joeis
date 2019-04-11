package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155634 <code>7^n + 5^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A155634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155634() {
    super(new long[] {35, -47, 13}, new long[] {1, 11, 73});
  }
}
