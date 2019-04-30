package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180222 <code>a(n) = 4*a(n-1) + 8*a(n-2)</code>, with <code>a(1)=0</code> and <code>a(2)=1</code>.
 * @author Sean A. Irvine
 */
public class A180222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180222() {
    super(new long[] {8, 4}, new long[] {0, 1});
  }
}
