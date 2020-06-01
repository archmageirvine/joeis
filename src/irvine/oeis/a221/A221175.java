package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221175 <code>a(0)=-5, a(1)=6;</code> thereafter <code>a(n) = 2*a(n-1) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A221175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221175() {
    super(new long[] {1, 2}, new long[] {-5, 6});
  }
}
