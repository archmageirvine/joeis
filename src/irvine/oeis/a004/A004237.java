package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004237.
 * @author Sean A. Irvine
 */
public class A004237 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(100.0 * Math.log(++mN)));
  }
}
