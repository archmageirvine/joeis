package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A037072 Squares which are the sum of twin prime pairs.
 * @author Sean A. Irvine
 */
public class A037072 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next().multiply2().add(2);
      if (s.isSquare()) {
        return s;
      }
    }
  }
}
