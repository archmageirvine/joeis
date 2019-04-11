package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110213 <code>a(n+3) = 6*a(n) - 5*a(n+2), a(0) = 1, a(1) = -7, a(2) = 35</code>.
 * @author Sean A. Irvine
 */
public class A110213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110213() {
    super(new long[] {6, 0, -5}, new long[] {1, -7, 35});
  }
}
