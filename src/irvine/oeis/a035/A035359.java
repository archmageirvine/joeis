package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A035359 Number of partitions-into-distinct-parts of n (A000009) is a prime.
 * @author Sean A. Irvine
 */
public class A035359 extends A000009 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isProbablePrime()) {
        return Z.valueOf(size() - 1);
      }
    }
  }
}

