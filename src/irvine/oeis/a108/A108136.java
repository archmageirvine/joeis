package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108136 <code>a(1)=1; a(2)=1; a(3)=1; a(n) = 3*a(n-1) + 2*a(n-2) + a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A108136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108136() {
    super(new long[] {1, 2, 3}, new long[] {1, 1, 1});
  }
}
