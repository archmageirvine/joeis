package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000115 Denumerants: Expansion of 1/((1-x)*(1-x^2)*(1-x^5)).
 * @author Sean A. Irvine
 */
public class A000115 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    return Z.valueOf(++mN).square().add(10).divide(20);
  }
}

