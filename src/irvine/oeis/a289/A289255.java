package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289255 <code>a(n) = 4^n - 2*n - 1</code>.
 * @author Sean A. Irvine
 */
public class A289255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289255() {
    super(new long[] {4, -9, 6}, new long[] {1, 11, 57});
  }
}
