package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a034.A034886;

/**
 * A056851 Integers n such that the number of digits in n! is a cube.
 * @author Sean A. Irvine
 */
public class A056851 extends A034886 {

  @Override
  public Z next() {
    while (true) {
      final Z len = super.next();
      len.root(3);
      if (len.auxiliary() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
