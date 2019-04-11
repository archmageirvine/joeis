package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187734 <code>a(n)</code> is the number of n-walks between the vertices 1 and 3 of the Graph on the chalkboard in 'Good Will Hunting', <code>(1997)</code>.
 * @author Sean A. Irvine
 */
public class A187734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187734() {
    super(new long[] {-4, 6, 1}, new long[] {0, 2, 2});
  }
}
