package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070416 <code>a(n) = 7^n mod 32</code>.
 * @author Sean A. Irvine
 */
public class A070416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070416() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 7, 17, 23});
  }
}
