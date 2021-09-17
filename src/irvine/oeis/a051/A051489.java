package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051489 a(n) = n^(n+2) + (n+2)^n.
 * @author Sean A. Irvine
 */
public class A051489 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN + 2).add(Z.valueOf(mN + 2).pow(mN));
  }
}

