package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131895 <code>a(n) = (n + 2)*(5*n + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A131895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131895() {
    super(new long[] {1, -3, 3}, new long[] {1, 9, 22});
  }
}
