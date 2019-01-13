package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008786.
 * @author Sean A. Irvine
 */
public class A008786 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 5).pow(mN);
  }
}


