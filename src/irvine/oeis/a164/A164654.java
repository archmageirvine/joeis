package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164654 a(n) = 2*a(n-2) for n &gt; 2; a(1) = 3, a(2) = 8.
 * @author Sean A. Irvine
 */
public class A164654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164654() {
    super(new long[] {2, 0}, new long[] {3, 8});
  }
}
