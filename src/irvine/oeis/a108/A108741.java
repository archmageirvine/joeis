package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108741 Member r=100 of the family of Chebyshev sequences S_r(n) defined in A092184.
 * @author Sean A. Irvine
 */
public class A108741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108741() {
    super(new long[] {1, -99, 99}, new long[] {0, 1, 100});
  }
}
