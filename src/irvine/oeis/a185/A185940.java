package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185940 <code>a(n) = 1 - 2^(n+1) + 3^(n+2)</code>.
 * @author Sean A. Irvine
 */
public class A185940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185940() {
    super(new long[] {6, -11, 6}, new long[] {24, 74, 228});
  }
}
