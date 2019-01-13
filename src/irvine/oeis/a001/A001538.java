package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001538.
 * @author Sean A. Irvine
 */
public class A001538 implements Sequence {

  private long mN = -11;

  @Override
  public Z next() {
    mN += 12;
    return Z.valueOf(mN).multiply(mN + 10);
  }
}
