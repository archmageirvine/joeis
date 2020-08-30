package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034586 Log_2 of dimension of an irreducible Z_2 graded H-module for Clifford algebra Cl_n.
 * @author Sean A. Irvine
 */
public class A034586 extends A034585 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitLength() - 1);
  }
}
