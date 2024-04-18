package irvine.oeis.a066;

import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066900 a(n) = max( {k : phi(k)==n (mod(k)) } ).
 * @author Sean A. Irvine
 */
public class A066900 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Set<Z> inv = InverseEuler.inversePhi(mN);
    final Z m = inv.isEmpty() ? mN : InverseEuler.inversePhi(mN).last();
    for (Z k = m; true; k = k.subtract(1)) {
      if (Functions.PHI.z(k).equals(mN.mod(k))) {
        return k;
      }
    }
  }
}
