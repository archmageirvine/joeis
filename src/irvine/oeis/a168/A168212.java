package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168212 <code>a(n) = 7*n - a(n-1) + 1</code> with <code>n&gt;1, a(1)=4</code>.
 * @author Sean A. Irvine
 */
public class A168212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168212() {
    super(new long[] {-1, 1, 1}, new long[] {4, 11, 11});
  }
}
