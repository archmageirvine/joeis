package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020955 a(n) = n^(2^n - n - 1).
 * @author Sean A. Irvine
 */
public class A020955 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow((1 << mN) - mN - 1);
  }
}
