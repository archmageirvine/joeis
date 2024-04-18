package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050938 Start of consecutive solutions of phi(x) = phi(x+2). That is, phi(a(n)) = phi(a(n)+2) and phi(a(n)+1) = phi(a(n)+3).
 * @author Sean A. Irvine
 */
public class A050938 extends Sequence1 {

  private Z mN = Z.SIX;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.PHI.z(mN).equals(Functions.PHI.z(mN.add(2))) && Functions.PHI.z(mN.add(1)).equals(Functions.PHI.z(mN.add(3)))) {
        return mN;
      }
    }
  }
}
