package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083234 <code>a(n) = (3*10^n + 2^n)/4</code>.
 * @author Sean A. Irvine
 */
public class A083234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083234() {
    super(new long[] {-20, 12}, new long[] {1, 8});
  }
}
