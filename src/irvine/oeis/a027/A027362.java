package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a003.A003473;

/**
 * A027362 Number of Hamiltonian cycles in the directed graph with 2n nodes {0..2n-1} and edges from each i to 2i (mod 2n) and to 2i+1 (mod 2n).
 * @author Sean A. Irvine
 */
public class A027362 extends A003473 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
