package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154024 <code>a(n+2) = 49*a(n+1) - a(n), a(1)=0, a(2)=7</code>.
 * @author Sean A. Irvine
 */
public class A154024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154024() {
    super(new long[] {-1, 49}, new long[] {0, 7});
  }
}
