package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a001.A001176;

/**
 * A053030 Numbers with 2 zeros in Fibonacci numbers mod m.
 * @author Sean A. Irvine
 */
public class A053030 extends A001176 {

  @Override
  public Z next() {
    while (true) {
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
