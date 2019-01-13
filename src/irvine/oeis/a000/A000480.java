package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000480.
 * @author Sean A. Irvine
 */
public class A000480 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(Math.cos(++mN)));
  }
}
