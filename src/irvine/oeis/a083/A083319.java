package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083319 <code>4^n+3^n-2^n</code>.
 * @author Sean A. Irvine
 */
public class A083319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083319() {
    super(new long[] {24, -26, 9}, new long[] {1, 5, 21});
  }
}
