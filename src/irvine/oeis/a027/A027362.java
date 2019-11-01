package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a003.A003473;

/**
 * A027362 Number of Hamiltonian cycles in the directed graph with <code>2n</code> nodes <code>{0..2n-1}</code> and edges from each i to <code>2i (mod 2n)</code> and to <code>2i+1 (mod 2n)</code>.
 * @author Sean A. Irvine
 */
public class A027362 extends A003473 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
