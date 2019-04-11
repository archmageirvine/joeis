package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214779 <code>a(n) = 3*a(n-2) - a(n-3)</code> with <code>a(0)=-1, a(1)=1, a(2)=-4</code>.
 * @author Sean A. Irvine
 */
public class A214779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214779() {
    super(new long[] {-1, 3, 0}, new long[] {-1, 1, -4});
  }
}
