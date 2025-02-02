package irvine.oeis.a117;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074851.
 * @author Sean A. Irvine
 */
public class A117673 extends A000040 {

  @Override
  public Z next() {
    final Z p2 = super.next().multiply2();
    long k = 0;
    while (true) {
      if (p2.multiply(++k).add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
