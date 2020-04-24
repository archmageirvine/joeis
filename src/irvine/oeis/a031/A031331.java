package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031331 Position of <code>n-th 6</code> in <code>A031324</code>.
 * @author Sean A. Irvine
 */
public class A031331 extends A031324 {

  {
    super.next();
    super.next();
  }

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.SIX.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

