package irvine.oeis.a104;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A104320 Number of zeros in ternary representation of 2^n.
 * @author Sean A. Irvine
 */
public class A104320 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitCounts(Z.ONE.shiftLeft(++mN), 3)[0]);
  }
}

