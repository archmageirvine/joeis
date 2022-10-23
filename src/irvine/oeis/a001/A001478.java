package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001478 The negative integers.
 * @author Sean A. Irvine
 */
public class A001478 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(--mN);
  }
}
