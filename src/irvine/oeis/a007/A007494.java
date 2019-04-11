package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007494 Numbers that are congruent to 0 or <code>2 mod 3</code>.
 * @author Sean A. Irvine
 */
public class A007494 implements Sequence {

  private long mN = -1;
  private long mAdd = 1;

  @Override
  public Z next() {
    mN += mAdd;
    mAdd = 3 - mAdd;
    return Z.valueOf(mN);
  }
}
