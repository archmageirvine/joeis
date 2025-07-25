package irvine.oeis.a077;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077287 If the least prime factor of ((prime(k)*prime(k+1))^2 + 1)/2 for k &gt;= 2 is not yet in the sequence, then add it to the sequence.
 * @author Sean A. Irvine
 */
public class A077287 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = Functions.NEXT_PRIME.z(mP);
      final Z lpf = Functions.LPF.z(mP.multiply(Functions.NEXT_PRIME.z(mP)).square().add(1).divide2());
      if (mSeen.add(lpf)) {
        return lpf;
      }
    }
  }
}
