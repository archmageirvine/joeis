package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000195 a(n) = floor(log(n)).
 * @author Sean A. Irvine
 */
public class A000195 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.log(++mN));
  }
}

