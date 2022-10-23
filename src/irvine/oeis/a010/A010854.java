package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010854 Constant sequence: a(n) = 15.
 * @author Sean A. Irvine
 */
public class A010854 extends Sequence0 {

  private static final Z FIFTEEN = Z.valueOf(15);

  @Override
  public Z next() {
    return FIFTEEN;
  }
}

