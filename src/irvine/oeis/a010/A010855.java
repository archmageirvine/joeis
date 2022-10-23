package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010855 Constant sequence: a(n) = 16.
 * @author Sean A. Irvine
 */
public class A010855 extends Sequence0 {

  private static final Z SIXTEEN = Z.valueOf(16);

  @Override
  public Z next() {
    return SIXTEEN;
  }
}

