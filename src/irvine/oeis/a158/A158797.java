package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158797 a(n)=a(n-1)+36*a(n-2), a(0)=1, a(1)=6 .
 * @author Sean A. Irvine
 */
public class A158797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158797() {
    super(new long[] {36, 1}, new long[] {1, 6});
  }
}
