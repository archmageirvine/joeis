package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083174 Leading diagonal of A083173.
 * @author Sean A. Irvine
 */
public class A083174 extends A083173 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (int k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}

