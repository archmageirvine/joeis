package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A004086.
 * @author Sean A. Irvine
 */
public class A004086 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ZUtils.reverse(Z.valueOf(++mN));
  }
}

