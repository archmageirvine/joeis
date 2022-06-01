package irvine.oeis.a142;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A142976 a(n) = (1/18)*(9*n^2 + 21*n + 10 - 4^(n+2)*(3*n+5) + 10*7^(n+1)).
 * @author Sean A. Irvine
 */
public class A142976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142976() {
    super(new long[] {-112, 408, -567, 374, -120, 18}, new long[] {1, 39, 546, 5482, 47175, 373809});
  }
}
