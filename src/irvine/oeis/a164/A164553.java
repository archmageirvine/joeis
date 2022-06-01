package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164553 a(n) = 14*a(n-1)-43*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 11.
 * @author Sean A. Irvine
 */
public class A164553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164553() {
    super(new long[] {-43, 14}, new long[] {1, 11});
  }
}
