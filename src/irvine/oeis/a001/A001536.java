package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001536 <code>(11n+1)(11n+10)</code>.
 * @author Sean A. Irvine
 */
public class A001536 implements Sequence {

  private long mN = -10;

  @Override
  public Z next() {
    mN += 11;
    return Z.valueOf(mN).multiply(mN + 9);
  }
}
