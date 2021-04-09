package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046350 Odd composite numbers with only palindromic prime factors.
 * @author Sean A. Irvine
 */
public class A046350 extends A046349 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isEven()) {
        return t;
      }
    }
  }
}
