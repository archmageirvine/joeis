package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003682 Number of (undirected) Hamiltonian paths in the n-ladder graph K_2 X P_n.
 * @author Sean A. Irvine
 */
public class A003682 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(3).add(mN.multiply2()).divide(mN.add(1));
  }
}
