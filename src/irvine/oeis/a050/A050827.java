package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a005.A005229;

/**
 * A050827 Even numbers in the sequence generated by a(n) = a(a(n-2))+a(n-a(n-2)).
 * @author Sean A. Irvine
 */
public class A050827 extends A005229 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isEven()) {
        return t;
      }
    }
  }
}
