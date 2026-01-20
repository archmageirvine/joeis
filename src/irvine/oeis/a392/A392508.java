package irvine.oeis.a392;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A392508 allocated for Alain Rocchelli.
 * @author Sean A. Irvine
 */
public class A392508 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    long cnt = 0;
    final HashSet<Z> seen = new HashSet<>();
    while (!Z.FIVE.equals(p)) {
      if (!seen.add(p)) {
        return Z.NEG_ONE;
      }
      p = Functions.GPF.z(p.multiply2().add(mPrime.nextPrime(p)));
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
