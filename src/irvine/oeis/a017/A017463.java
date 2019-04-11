package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017463 <code>a(n) = (11*n + 6)^3</code>.
 * @author Sean A. Irvine
 */
public class A017463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017463() {
    super(new long[] {-1, 4, -6, 4}, new long[] {216, 4913, 21952, 59319});
  }
}
