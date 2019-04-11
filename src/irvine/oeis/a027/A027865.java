package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027865 Sums of six consecutive squares: <code>a(n) = n^2 + (n+1)^2 + (n+2)^2 + (n+3)^2 + (n+4)^2 + (n+5)^2</code>.
 * @author Sean A. Irvine
 */
public class A027865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027865() {
    super(new long[] {1, -3, 3}, new long[] {55, 91, 139});
  }
}
