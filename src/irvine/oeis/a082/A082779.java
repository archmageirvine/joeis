package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082779 <code>a(1) = 4, a(n) =</code> smallest palindromic multiple of <code>a(n-1)</code> obtained by inserting digits anywhere in <code>a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A082779 extends A082776 {

  @Override
  protected Z first() {
    return Z.FOUR;
  }
}

