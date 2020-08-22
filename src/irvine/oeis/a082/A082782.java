package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082782 a(1) = 7, a(n) = smallest palindromic multiple of a(n-1) obtained by inserting digits anywhere in a(n-1).
 * @author Sean A. Irvine
 */
public class A082782 extends A082776 {

  @Override
  protected Z first() {
    return Z.SEVEN;
  }
}

