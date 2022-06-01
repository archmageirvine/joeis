package irvine.oeis.a238;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A238976 a(n) = ((3^(n-1)-1)^2)/4.
 * @author Sean A. Irvine
 */
public class A238976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238976() {
    super(new long[] {27, -39, 13}, new long[] {0, 1, 16});
  }
}
