package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158608 a(n)=a(n-1)+16*a(n-2), starting a(0)=1, a(1)=4.
 * @author Sean A. Irvine
 */
public class A158608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158608() {
    super(new long[] {16, 1}, new long[] {1, 4});
  }
}
