package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157858 <code>a(n) = 1728000*n - 240</code>.
 * @author Sean A. Irvine
 */
public class A157858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157858() {
    super(new long[] {-1, 2}, new long[] {1727760, 3455760});
  }
}
