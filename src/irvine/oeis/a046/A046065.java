package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046065 a(n) = n^(n+2) - (n+2)^n.
 * @author Sean A. Irvine
 */
public class A046065 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN + 2).subtract(Z.valueOf(mN + 2).pow(mN));
  }
}
