package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004245 a(n) = ceiling(10000*log(n)).
 * @author Sean A. Irvine
 */
public class A004245 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(10000.0 * Math.log(++mN)));
  }
}
