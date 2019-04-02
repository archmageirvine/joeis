package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008787 (n+6)^n.
 * @author Sean A. Irvine
 */
public class A008787 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 6).pow(mN);
  }
}


