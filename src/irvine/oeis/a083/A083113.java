package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083113 a(n) = (A083112(n) + 1)/n.
 * @author Sean A. Irvine
 */
public class A083113 extends A083112 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().add(1).divide(++mN);
  }
}

