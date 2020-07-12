package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033677 Smallest divisor of <code>n &gt;= sqrt(n)</code>.
 * @author Sean A. Irvine
 */
public class A033677 extends A033676 {

  @Override
  public Z next() {
    final Z t = super.next();
    return Z.valueOf(mN).divide(t);
  }
}
