package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046950 Square elements of A046949.
 * @author Sean A. Irvine
 */
public class A046950 extends A046949 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isSquare()) {
        return t;
      }
    }
  }
}
