package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015544 Lucas sequence <code>U(5,-8): a(n+1) = 5*a(n) + 8*a(n-1), a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A015544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015544() {
    super(new long[] {8, 5}, new long[] {0, 1});
  }
}
