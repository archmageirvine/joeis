package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024490 <code>a(n) =</code> C(n-1,1) + C(n-3,3) <code>+ </code>... + C(n-2*m-1,2*m+1), where m <code>= floor((n-2)/4)</code>.
 * @author Sean A. Irvine
 */
public class A024490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024490() {
    super(new long[] {1, 0, -1, 2}, new long[] {1, 2, 3, 4});
  }
}
