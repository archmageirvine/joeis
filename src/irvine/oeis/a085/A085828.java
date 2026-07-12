package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085828 Lesser number n of a pair such that neither n nor n+1 contain the digit zero in bases 3 to 10.
 * @author Sean A. Irvine
 */
public class A085828 extends A085509 {

  private Z mA = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).isOne()) {
        return t;
      }
    }
  }
}
