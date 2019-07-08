package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004233 <code>a(n) = ceiling(log(n))</code>.
 * @author Sean A. Irvine
 */
public class A004233 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(Math.log(++mN)));
  }
}
