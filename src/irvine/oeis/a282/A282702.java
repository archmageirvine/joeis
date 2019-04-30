package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282702 <code>a(n) = 3*a(n-1) + a(n-2)</code>, with <code>a(0)=4, a(1)=11</code>.
 * @author Sean A. Irvine
 */
public class A282702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282702() {
    super(new long[] {1, 3}, new long[] {4, 11});
  }
}
