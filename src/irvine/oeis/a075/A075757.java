package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075757 Smallest positive integer k such that n!+k!+1 is prime, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A075757 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z f = Functions.FACTORIAL.z(mN);
    final Z t = f.add(1);
    long k = 1;
    while (true) {
      if (t.mod(++k) == 0) {
        return Z.ZERO;
      }
      if (t.add(Functions.FACTORIAL.z(k)).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
