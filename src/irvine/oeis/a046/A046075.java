package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a033.A033619;

/**
 * A046075 Nontrivial undulants; base 10 numbers &gt;100 which are of the form aba, abab, ababa, ..., where a != b.
 * @author Sean A. Irvine
 */
public class A046075 extends A033619 {

  private static final Z Z100 = Z.valueOf(100);

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (a.mod(100) % 11 != 0 && a.compareTo(Z100) > 0) {
        return a;
      }
    }
  }
}
