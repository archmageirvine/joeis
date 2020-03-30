package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030198 <code>n^((n+1)^(n+2))</code>.
 * @author Sean A. Irvine
 */
public class A030198 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(Z.valueOf(mN + 1).pow(mN + 2));
  }
}
