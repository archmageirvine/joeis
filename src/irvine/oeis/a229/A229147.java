package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229147 <code>a(n) = n^4*(3*n+2)</code>.
 * @author Sean A. Irvine
 */
public class A229147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229147() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 5, 128, 891, 3584, 10625});
  }
}
