package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004234 <code>10*log(n)</code> rounded down.
 * @author Sean A. Irvine
 */
public class A004234 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(10.0 * Math.log(++mN)));
  }
}
