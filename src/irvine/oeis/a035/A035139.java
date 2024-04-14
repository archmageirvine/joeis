package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035139 Digits of prime factors of k do not appear in k.
 * @author Sean A. Irvine
 */
public class A035139 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    outer:
    while (true) {
      final int syn = Functions.SYNDROME.i(++mN);
      for (final Z p : Jaguar.factor(mN).toZArray()) {
        if ((Functions.SYNDROME.i(p) & syn) != 0) {
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}

