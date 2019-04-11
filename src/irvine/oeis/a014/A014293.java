package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014293 <code>n^(n+1)-n+1</code>.
 * @author Sean A. Irvine
 */
public class A014293 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN + 1).subtract(mN - 1);
  }
}

