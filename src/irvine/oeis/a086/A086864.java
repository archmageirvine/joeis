package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086864 <code>a(n) = (n-1)*(n-2)*(n-3)*(3*n-10)*3^(n-5)/4</code>.
 * @author Sean A. Irvine
 */
public class A086864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086864() {
    super(new long[] {243, -405, 270, -90, 15}, new long[] {0, 0, 0, 1, 30});
  }
}
