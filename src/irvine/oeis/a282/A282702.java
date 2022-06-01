package irvine.oeis.a282;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A282702 a(n) = 3*a(n-1) + a(n-2), with a(0)=4, a(1)=11.
 * @author Sean A. Irvine
 */
public class A282702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282702() {
    super(new long[] {1, 3}, new long[] {4, 11});
  }
}
