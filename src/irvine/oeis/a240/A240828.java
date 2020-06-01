package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240828 <code>a(1)=a(2)=0, a(3)=2;</code> thereafter <code>a(n) = Sum( a(n-i-s-a(n-i-1)), i=0..k-1 )</code>, where <code>s=0, k=3</code>.
 * @author Sean A. Irvine
 */
public class A240828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240828() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {0, 0, 2, 2, 4, 2});
  }
}
