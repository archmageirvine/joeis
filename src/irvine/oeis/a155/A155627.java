package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155627 <code>a(n) = 6^n - 4^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A155627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155627() {
    super(new long[] {24, -34, 11}, new long[] {1, 3, 21});
  }
}
