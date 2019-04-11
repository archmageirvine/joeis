package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247855 The 10th Hermite Polynomial evaluated at n: H_10(n) <code>= 1024*n^10 - 23040*n^8 + 161280*n^6 - 403200*n^4 + 302400*n^2 - 30240</code>.
 * @author Sean A. Irvine
 */
public class A247855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247855() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {-30240, 8224, 200416, -3093984, 125984224, 3275529760L, 30232000224L, 174454774816L, 753610971616L, 2661760648224L, 8093278209760L});
  }
}
