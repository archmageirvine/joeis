package irvine.oeis.a050;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050938 Start of consecutive solutions of phi(x) = phi(x+2). That is, phi(a(n)) = phi(a(n)+2) and phi(a(n)+1) = phi(a(n)+3).
 * @author Sean A. Irvine
 */
public class A050938 implements Sequence {

  private Z mN = Z.SIX;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Euler.phi(mN).equals(Euler.phi(mN.add(2))) && Euler.phi(mN.add(1)).equals(Euler.phi(mN.add(3)))) {
        return mN;
      }
    }
  }
}
