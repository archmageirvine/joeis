package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000093 a(n) = floor(n^(3/2)).
 * @author Sean A. Irvine
 */
public class A000093 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.square().multiply(n).sqrt();
  }
}

