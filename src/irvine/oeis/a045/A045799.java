package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045799 In the list of divisors of n (in binary), each digit 0-1 appears equally often.
 * @author Sean A. Irvine
 */
public class A045799 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      long ones = 0;
      long total = 0;
      for (final Z d : Jaguar.factor(++mN).divisors()) {
        ones += d.bitCount();
        total += d.bitLength();
      }
      if (2 * ones == total) {
        return new Z(Long.toBinaryString(mN));
      }
    }
  }
}

