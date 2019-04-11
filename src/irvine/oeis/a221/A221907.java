package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221907 <code>5^n + 5*n</code>.
 * @author Sean A. Irvine
 */
public class A221907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221907() {
    super(new long[] {5, -11, 7}, new long[] {1, 10, 35});
  }
}
