package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082781 a(1) = 6, a(n) = smallest palindromic multiple of a(n-1) obtained by inserting digits anywhere in a(n-1).
 * @author Sean A. Irvine
 */
public class A082781 extends A082776 {

  @Override
  protected Z first() {
    return Z.SIX;
  }
}

