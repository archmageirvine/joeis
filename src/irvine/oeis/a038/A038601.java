package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038601 Prime numbers p such that the number of partitions of p is also a prime.
 * @author Sean A. Irvine
 */
public class A038601 extends A000040 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.PARTITIONS.z(p).isProbablePrime()) {
        return p;
      }
    }
  }
}
