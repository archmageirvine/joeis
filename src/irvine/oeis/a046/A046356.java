package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046356 Odd numbers with only palindromic prime factors whose sum is palindromic (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046356 extends A046355 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isOdd()) {
        return t;
      }
    }
  }
}
