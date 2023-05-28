package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063928 Largest nonprime proper divisor of n (with a(1)=1).
 * @author Sean A. Irvine
 */
public class A063928 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] d = Jaguar.factor(++mN).divisorsSorted();
    for (int k = d.length - 2; k >= 0; --k) {
      if (!d[k].isProbablePrime()) {
        return d[k];
      }
    }
    return Z.ONE;
  }
}
