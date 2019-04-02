package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024490 a(n) = C(n-1,1) + C(n-3,3) + ... + C(n-2*m-1,2*m+1), where m = floor((n-2)/4).
 * @author Sean A. Irvine
 */
public class A024490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024490() {
    super(new long[] {1, 0, -1, 2}, new long[] {1, 2, 3, 4});
  }
}
