package irvine.oeis.a027;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027434.
 * @author Sean A. Irvine
 */
public class A027434 implements Sequence {

  private long mN = -3;

  @Override
  public Z next() {
    mN += 4;
    return Z.ONE.add(LongUtils.sqrt(mN));
  }
}
