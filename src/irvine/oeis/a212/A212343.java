package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212343 <code>a(n) = (n+1)*(n-2)*(n-3)/2</code>.
 * @author Sean A. Irvine
 */
public class A212343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212343() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 5, 18});
  }
}
