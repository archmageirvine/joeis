package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066204 a(1) = 4; a(2) = 3; a(3) = 1; for n &gt; 3, a(n) = a(n-1)-(n-1) if this is positive and has not already appeared in the sequence, otherwise a(n) = a(n-1)+(n-1).
 * @author Sean A. Irvine
 */
public class A066204 extends A066202 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mB.get(++mN, 3));
  }
}
