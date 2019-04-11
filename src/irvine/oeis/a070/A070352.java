package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070352 <code>a(n) = 3^n mod 5</code>; or period 4, repeat <code>[1, 3, 4, 2]</code>.
 * @author Sean A. Irvine
 */
public class A070352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070352() {
    super(new long[] {1, -1, 1}, new long[] {1, 3, 4});
  }
}
