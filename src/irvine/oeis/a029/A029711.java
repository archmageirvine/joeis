package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029711 <code>a(n) = n^(n+1) + (n-1)^2</code>.
 * @author Sean A. Irvine
 */
public class A029711 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).square().add(Z.valueOf(++mN).pow(mN + 1));
  }
}
