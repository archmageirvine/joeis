package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046373 Numbers of the form p*q*r where p,q,r are (not necessarily distinct) odd palindromic primes (odd terms from A002385).
 * @author Sean A. Irvine
 */
public class A046373 extends A046369 {

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
