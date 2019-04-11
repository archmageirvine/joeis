package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164581 <code>a(n) = 5*a(n - 1) + a(n - 2),</code> with <code>a(0)=1, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A164581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164581() {
    super(new long[] {1, 5}, new long[] {1, 2});
  }
}
