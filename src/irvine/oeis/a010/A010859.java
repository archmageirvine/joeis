package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010859 Constant sequence: a(n) = 20.
 * @author Sean A. Irvine
 */
public class A010859 extends Sequence0 {

  private static final Z TWENTY = Z.valueOf(20);

  @Override
  public Z next() {
    return TWENTY;
  }
}

