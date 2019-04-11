package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182466 <code>a(n) = 3a(n-1) - 2a(n-2)</code> with <code>a(0)=32</code> and <code>a(1)=80</code>.
 * @author Sean A. Irvine
 */
public class A182466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182466() {
    super(new long[] {-2, 3}, new long[] {32, 80});
  }
}
