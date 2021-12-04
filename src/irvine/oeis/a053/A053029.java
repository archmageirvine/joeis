package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a001.A001176;

/**
 * A053029 Numbers with 4 zeros in Fibonacci numbers mod m.
 * @author Sean A. Irvine
 */
public class A053029 extends A001176 {

  @Override
  public Z next() {
    while (true) {
      if (Z.FOUR.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
