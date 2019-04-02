package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164546 a(n) = 8*a(n-1)-8*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 10.
 * @author Sean A. Irvine
 */
public class A164546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164546() {
    super(new long[] {-8, 8}, new long[] {1, 10});
  }
}
