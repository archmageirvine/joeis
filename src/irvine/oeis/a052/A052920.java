package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052920 <code>a(n) = a(n-3) + a(n-5)</code> with initial values <code>1,0,0,1,0</code>.
 * @author Sean A. Irvine
 */
public class A052920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052920() {
    super(new long[] {1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0});
  }
}
