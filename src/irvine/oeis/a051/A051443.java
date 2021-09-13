package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051443 a(n) = n^(n+1)*(n+1)^n.
 * @author Sean A. Irvine
 */
public class A051443 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN + 1).multiply(Z.valueOf(mN + 1).pow(mN));
  }
}

