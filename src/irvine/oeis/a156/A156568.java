package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156568 a(n) = 6*a(n-1)-a(n-2) for n &gt; 2; a(1)=23, a(2)=115.
 * @author Sean A. Irvine
 */
public class A156568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156568() {
    super(new long[] {-1, 6}, new long[] {23, 115});
  }
}
