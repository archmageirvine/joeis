package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004229.
 * @author Sean A. Irvine
 */
public class A004229 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Math.round(10000.0 * Math.log10(++mN)));
  }
}
