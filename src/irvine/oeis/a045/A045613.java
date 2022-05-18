package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045613 Minimal elements of pairs of "Super Unitary Amicable Numbers", sorted by their minimal elements.
 * @author Sean A. Irvine
 */
public class A045613 implements Sequence {

  private Z mN = Z.valueOf(32);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z ua = Jaguar.factor(mN).unitarySigma();
      final Z uua = Jaguar.factor(ua).unitarySigma();
      final Z b = uua.subtract(mN);
      if (b.compareTo(mN) > 0 && Jaguar.factor(Jaguar.factor(b).unitarySigma()).unitarySigma().equals(uua)) {
        return mN;
      }
    }
  }
}
