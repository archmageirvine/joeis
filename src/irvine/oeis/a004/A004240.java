package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004240 a(n) = floor(1000*log(n)).
 * @author Sean A. Irvine
 */
public class A004240 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(1000.0 * Math.log(++mN)));
  }
}
