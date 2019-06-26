package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009752;

/**
 * A024255 <code>a(0)=0, a(n) = n*E(2n-1)</code> for <code>n &gt;= 1</code>, where <code>E(n) = A000111(n)</code> are the Euler (or <code>up-down)</code> numbers.
 * @author Sean A. Irvine
 */
public class A024255 extends A009752 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

