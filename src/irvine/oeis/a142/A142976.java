package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142976 a(n) = 5/9 + n^2/2 + 7*n/6 - 4^(n+1) * (2*n/3 + 10/9) + 5*7^(n+1)/9.
 * @author Sean A. Irvine
 */
public class A142976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142976() {
    super(new long[] {-112, 408, -567, 374, -120, 18}, new long[] {1, 39, 546, 5482, 47175, 373809});
  }
}
