package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046896 Square elements of A046895.
 * @author Sean A. Irvine
 */
public class A046896 extends A046895 {

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
