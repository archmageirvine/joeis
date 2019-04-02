package irvine.oeis.a007;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007456 Days required to spread gossip to n people.
 * @author Sean A. Irvine
 */
public class A007456 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Z.valueOf(LongUtils.lg(mN - 1) + ((mN - 2) & 1) + 1);
  }
}

