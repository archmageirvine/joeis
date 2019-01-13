package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004224.
 * @author Sean A. Irvine
 */
public class A004224 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(100.0 * Math.log10(++mN)));
  }
}
