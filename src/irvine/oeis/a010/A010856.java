package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010856 Constant sequence: a(n) = 17.
 * @author Sean A. Irvine
 */
public class A010856 extends Sequence0 {

  private static final Z SEVENTEEN = Z.valueOf(17);

  @Override
  public Z next() {
    return SEVENTEEN;
  }
}

