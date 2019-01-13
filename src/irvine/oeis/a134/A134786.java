package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.a007.A007191;

/**
 * A134786.
 * @author Sean A. Irvine
 */
public class A134786 extends A007191 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.FOUR : a.abs();
  }
}

