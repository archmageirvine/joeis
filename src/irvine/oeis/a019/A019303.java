package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019303 "Pascal sweep" for k=2: draw a horizontal line through the 1 at C(k,0) in Pascal's triangle; rotate this line and record the sum of the numbers on it (excluding the initial 1).
 * @author Sean A. Irvine
 */
public class A019303 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf((++mN & 1) == 0 ? 1 : mN / 2 + 4);
  }
}

