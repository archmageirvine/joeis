package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056125 <code>a(n) =</code> (5n+4)*C(n+7,7)/4.
 * @author Sean A. Irvine
 */
public class A056125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056125() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 18, 126, 570, 1980, 5742, 14586, 33462, 70785});
  }
}
