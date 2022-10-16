package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059631 Carryless multiplication 8 X n base 10.
 * @author Sean A. Irvine
 */
public class A059631 extends A059627 {

  @Override
  public Z next() {
    final Z t = super.next();
    return nimSum(10, t, t);
  }
}

