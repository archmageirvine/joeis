package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070426 <code>a(n) = 7^n mod 44</code>.
 * @author Sean A. Irvine
 */
public class A070426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070426() {
    super(new long[] {1, -1, 0, 0, 0, 1}, new long[] {1, 7, 5, 35, 25, 43});
  }
}
