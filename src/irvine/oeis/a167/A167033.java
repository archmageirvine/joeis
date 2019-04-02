package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167033 a(n) = 20*a(n-1) - 64*a(n-2) + 3 for n &gt; 1; a(0) = 1, a(1) = 22.
 * @author Sean A. Irvine
 */
public class A167033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167033() {
    super(new long[] {64, -84, 21}, new long[] {1, 22, 379});
  }
}
