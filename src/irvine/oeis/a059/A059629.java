package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059629 Carryless multiplication 6 X n base 10.
 * @author Sean A. Irvine
 */
public class A059629 extends A059626 {

  @Override
  public Z next() {
    final Z t = super.next();
    return nimSum(10, t, t);
  }
}

