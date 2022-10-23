package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010858 Constant sequence: a(n) = 19.
 * @author Sean A. Irvine
 */
public class A010858 extends Sequence0 {

  private static final Z NINETEEN = Z.valueOf(19);

  @Override
  public Z next() {
    return NINETEEN;
  }
}

