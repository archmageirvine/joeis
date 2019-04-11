package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257289 <code>a(n) = 8*9^n - 7*8^n</code>.
 * @author Sean A. Irvine
 */
public class A257289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257289() {
    super(new long[] {-72, 17}, new long[] {1, 16});
  }
}
