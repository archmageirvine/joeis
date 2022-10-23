package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010852 Constant sequence: a(n) = 13.
 * @author Sean A. Irvine
 */
public class A010852 extends Sequence0 {

  private static final Z THIRTEEN = Z.valueOf(13);

  @Override
  public Z next() {
    return THIRTEEN;
  }
}

