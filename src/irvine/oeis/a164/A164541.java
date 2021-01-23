package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164541 a(n) = 6*a(n-1) - a(n-2) for n &gt; 1; a(0) = 1, a(1) = 15.
 * @author Sean A. Irvine
 */
public class A164541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164541() {
    super(new long[] {-1, 6}, new long[] {1, 15});
  }
}
