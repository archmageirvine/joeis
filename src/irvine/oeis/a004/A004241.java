package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004241 1000*log(n) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A004241 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Math.round(1000.0 * Math.log(++mN)));
  }
}
