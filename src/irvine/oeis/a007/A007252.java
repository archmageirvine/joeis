package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a106.A106248;

/**
 * A007252 McKay-Thompson series of class <code>5B</code> for the Monster group with <code>a(0) = 0</code>.
 * @author Sean A. Irvine
 */
public class A007252 extends A106248 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.ZERO : a;
  }
}

