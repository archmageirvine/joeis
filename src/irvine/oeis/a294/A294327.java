package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294327 <code>a(n) = ((9*n + 8)*10^n - 8)/9</code>.
 * @author Sean A. Irvine
 */
public class A294327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294327() {
    super(new long[] {100, -120, 21}, new long[] {0, 18, 288});
  }
}
