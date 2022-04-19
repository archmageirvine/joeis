package irvine.oeis.a158;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A158277 The lesser of twin prime pairs with each prime in a different century.
 * @author Georg Fischer
 */
public class A158277 extends A001359 {

  private static final Z Z99 = Z.valueOf(99);
  private static final Z Z100 = Z.valueOf(100);

  @Override
  public Z next() {
    while (true) {
      final Z lesser = super.next();
      if (Z99.equals(lesser.mod(Z100))) {
        return lesser;
      }
    }
  }
}
