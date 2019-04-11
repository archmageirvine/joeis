package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154023 <code>a(n+2) = 36*a(n+1) - a(n), a(1)=0, a(2)=6</code>.
 * @author Sean A. Irvine
 */
public class A154023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154023() {
    super(new long[] {-1, 36}, new long[] {0, 6});
  }
}
