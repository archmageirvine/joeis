package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004219.
 * @author Sean A. Irvine
 */
public class A004219 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(10.0 * Math.log10(++mN)));
  }
}
