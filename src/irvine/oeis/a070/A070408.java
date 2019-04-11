package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070408 <code>a(n) = 7^n mod 22</code>.
 * @author Sean A. Irvine
 */
public class A070408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070408() {
    super(new long[] {1, -1, 0, 0, 0, 1}, new long[] {1, 7, 5, 13, 3, 21});
  }
}
