package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004242 <code>a(n) = ceiling(1000*log(n))</code>.
 * @author Sean A. Irvine
 */
public class A004242 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(1000.0 * Math.log(++mN)));
  }
}
