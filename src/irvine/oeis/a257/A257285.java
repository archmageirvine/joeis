package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257285 a(n) = 4*5^n - 3*4^n.
 * @author Sean A. Irvine
 */
public class A257285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257285() {
    super(new long[] {-20, 9}, new long[] {1, 8});
  }
}
