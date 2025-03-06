package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075758 Smallest k such that n!+k!-1 is prime, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A075758 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(++mN);
    final Z t = f.subtract(1);
    final Z lpf = Functions.LPF.z(t);
    long k = 0;
    while (true) {
      if (++k > 2 && lpf.compareTo(k) <= 0) {
        return Z.ZERO;
      }
      if (t.add(Functions.FACTORIAL.z(k)).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
