package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004239 <code>a(n) = ceiling(100*log(n))</code>.
 * @author Sean A. Irvine
 */
public class A004239 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(100.0 * Math.log(++mN)));
  }
}
