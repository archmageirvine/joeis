package irvine.oeis.a061;
// manually deris/essent at 2022-10-26 11:22

import irvine.math.z.Z;
import irvine.oeis.a001.A001578;

/**
 * A061488 Factorize the Fibonacci numbers in order, skipping F(0)-F(2), F(6)=8 and F(12)=144; at each step at least one new prime will occur; append to the sequence the smallest such new prime.
 * at each step at least one new prime will occur; sequence smallest such new prime.
 * @author Georg Fischer
 */
public class A061488 extends A001578 {

  {
    setOffset(3);
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (!result.equals(Z.ONE)) {
        return result;
      }
    }
  }
}
