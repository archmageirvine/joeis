package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169726 <code>a(n) = 3*2^n*(2^n-1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A169726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169726() {
    super(new long[] {8, -14, 7}, new long[] {1, 7, 37});
  }
}
