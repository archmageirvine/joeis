package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025172 Let phi = arccos(1/3), the dihedral angle of the regular tetrahedron. Then cos(n*phi) = a(n)/3^n.
 * @author Sean A. Irvine
 */
public class A025172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025172() {
    super(new long[] {-9, 2}, new long[] {1, 1});
  }
}
