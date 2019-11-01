package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017505 <code>a(n) = (11*n + 9)^9</code>.
 * @author Sean A. Irvine
 */
public class A017505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017505() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {387420489, 512000000000L, 26439622160671L, 406671383849472L, 3299763591802133L, 18014398509481984L, 75084686279296875L, 257327417311663616L, 760231058654565217L, 1999004627104432128L});
  }
}
