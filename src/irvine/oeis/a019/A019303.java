package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019303 "Pascal sweep" for <code>k=2</code>: draw a horizontal line through the 1 at <code>C(k,0)</code> in Pascal's triangle; rotate this line and record the sum of the numbers on it (excluding the initial <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A019303 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf((++mN & 1) == 0 ? 1 : mN / 2 + 4);
  }
}

