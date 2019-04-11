package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087205 <code>a(n) = -2*a(n-1) + 4*a(n-2), a(0)=1, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A087205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087205() {
    super(new long[] {4, -2}, new long[] {1, 2});
  }
}
