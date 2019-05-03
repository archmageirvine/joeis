package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025172 Let phi <code>= arccos(1/3)</code>, the dihedral angle of the regular tetrahedron. Then <code>cos(n*phi) = a(n)/3^n</code>.
 * @author Sean A. Irvine
 */
public class A025172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025172() {
    super(new long[] {-9, 2}, new long[] {1, 1});
  }
}
