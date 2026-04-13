package irvine.oeis.a393;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393840 allocated for Arkadiusz Wesolowski.
 * @author Sean A. Irvine
 */
public class A393840 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long min = -1;
    long c = 0;
    for (final Z p : Jaguar.factor(Z.ONE.shiftLeft(1L << ++mN).add(1)).toZArray()) {
      final Z t = p.subtract(1);
      t.makeOdd();
      final long m = t.auxiliary();
      if (min < 0 || m <= min) {
        if (min < 0 || m < min) {
          c = 0;
          min = m;
        }
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
