package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221173 <code>a(0)=-3, a(1)=4</code>; thereafter <code>a(n) = 2*a(n-1) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A221173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221173() {
    super(new long[] {1, 2}, new long[] {-3, 4});
  }
}
