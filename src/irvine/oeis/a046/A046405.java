package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046405 Numbers of the form p*q*r where p,q,r are distinct odd palindromic primes (odd terms from A002385).
 * @author Sean A. Irvine
 */
public class A046405 extends A046401 {

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
