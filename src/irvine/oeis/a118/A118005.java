package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118005 a(n) = ((-1)^n*5^(n+1) + 9^(n+1))/14.
 * @author Sean A. Irvine
 */
public class A118005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118005() {
    super(new long[] {45, 4}, new long[] {1, 4});
  }
}
