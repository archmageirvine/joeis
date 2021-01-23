package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164532 a(n) = 6*a(n-2) for n &gt; 2; a(1) = 1, a(2) = 4.
 * @author Sean A. Irvine
 */
public class A164532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164532() {
    super(new long[] {6, 0}, new long[] {1, 4});
  }
}
