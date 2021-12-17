package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A053177 Odd composite k such that (k-1)/2 is prime.
 * @author Sean A. Irvine
 */
public class A053177 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().multiply2().add(1);
      if (!t.isProbablePrime()) {
        return t;
      }
    }
  }
}

