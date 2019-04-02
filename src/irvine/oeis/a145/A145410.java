package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145410 Number of 2-factors in K_6 X P_n.
 * @author Sean A. Irvine
 */
public class A145410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145410() {
    super(new long[] {-10480, -31008, 7160, 264}, new long[] {70, 24400, 6912340, 1997380720});
  }
}
