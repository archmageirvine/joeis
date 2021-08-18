package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050722 Palindromic triangular numbers arising from A050721 and A083571.
 * @author Sean A. Irvine
 */
public class A050722 extends A050721 {

  @Override
  public Z next() {
    final Z t = super.next();
    return t.multiply(t.add(1)).divide2();
  }
}

