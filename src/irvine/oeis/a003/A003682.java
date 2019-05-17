package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003682 Number of (undirected) Hamiltonian paths in the n-ladder graph <code>K_2 X P_n</code>.
 * @author Sean A. Irvine
 */
public class A003682 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(3).add(mN.multiply2()).divide(mN.add(1));
  }
}
