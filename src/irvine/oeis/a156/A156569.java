package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156569 a(n) = 6*a(n-1)-a(n-2) for n &gt; 2; a(1)=37, a(2)=205.
 * @author Sean A. Irvine
 */
public class A156569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156569() {
    super(new long[] {-1, 6}, new long[] {37, 205});
  }
}
