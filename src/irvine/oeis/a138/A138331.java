package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138331 <code>a(n) = C(n+5, 5)*(n+3)*(-1)^(n+1)*16/3</code>.
 * @author Sean A. Irvine
 */
public class A138331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138331() {
    super(new long[] {-1, -7, -21, -35, -35, -21, -7}, new long[] {-16, 128, -560, 1792, -4704, 10752, -22176});
  }
}
