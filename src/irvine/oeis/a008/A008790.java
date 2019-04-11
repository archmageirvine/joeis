package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008790 <code>n^(n+4)</code>.
 * @author Sean A. Irvine
 */
public class A008790 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN + 4);
  }
}


