package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a003.A003042;

/**
 * A066037 Number of (undirected) Hamiltonian cycles in the binary n-cube, or the number of cyclic n-bit Gray codes.
 * @author Sean A. Irvine
 */
public class A066037 extends A003042 {

  @Override
  public Z next() {
    return super.next().divide2().max(Z.ONE);
  }
}
