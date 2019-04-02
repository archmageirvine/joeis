package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082777 a(1) = 2, a(n) = smallest palindromic multiple of a(n-1) obtained by inserting digits anywhere in a(n-1).
 * @author Sean A. Irvine
 */
public class A082777 extends A082776 {

  @Override
  protected Z first() {
    return Z.TWO;
  }
}

