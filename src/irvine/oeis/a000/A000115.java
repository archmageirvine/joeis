package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000115.
 * @author Sean A. Irvine
 */
public class A000115 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    return Z.valueOf(++mN).square().add(10).divide(20);
  }
}

