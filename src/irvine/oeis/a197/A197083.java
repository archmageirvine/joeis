package irvine.oeis.a197;

import irvine.oeis.LinearRecurrence;

/**
 * A197083 Number of solutions to <code>a+b+c=d+e+f</code> with <code>0&lt;a&lt;=n, 0&lt;=b,c,d,e,f&lt;=n</code>.
 * @author Sean A. Irvine
 */
public class A197083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A197083() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 10, 96, 445, 1431, 3681});
  }
}
