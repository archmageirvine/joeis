package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a121.A121666;

/**
 * A045486 McKay-Thompson series of class <code>6C</code> for Monster <code>(and</code>, apart from signs, of class <code>12A)</code>.
 * @author Sean A. Irvine
 */
public class A045486 extends A121666 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.TWO : a;
  }
}

