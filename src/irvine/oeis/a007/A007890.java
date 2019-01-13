package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007890.
 * @author Sean A. Irvine
 */
public class A007890 implements Sequence {

  private static final Z FIXED = Z.valueOf(14233221);
  private static final long[] VALUES = {1, 11, 21, 1211, 1231, 131221, 132231, 232221, 134211, 14131231, 14231241, 24132231};
  private int mN = -1;

  @Override
  public Z next() {
    return mN < VALUES.length - 1 ? Z.valueOf(VALUES[++mN]) : FIXED;
  }
}
