package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120665 a(n) = 6*a(n-1) - 9*a(n-2) + 2*a(n-3) for n&gt;3, a(1)=0, a(2)=-1, a(3)=0,.
 * @author Sean A. Irvine
 */
public class A120665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120665() {
    super(new long[] {2, -9, 6}, new long[] {0, -1, 0});
  }
}
