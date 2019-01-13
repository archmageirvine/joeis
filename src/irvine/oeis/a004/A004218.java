package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004218.
 * @author Sean A. Irvine
 */
public class A004218 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(Math.log10(++mN)));
  }
}
