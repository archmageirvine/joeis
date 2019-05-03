package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099275 Unsigned member <code>r=-17</code> of the family of Chebyshev sequences <code>S_r(n)</code> defined in <code>A092184</code>.
 * @author Sean A. Irvine
 */
public class A099275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099275() {
    super(new long[] {-1, 18, 18}, new long[] {0, 1, 17});
  }
}
