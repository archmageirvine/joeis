package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006091 a(n) = n^n - n + 1.
 * @author Sean A. Irvine
 */
public class A006091 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN).subtract(mN - 1);
  }
}

