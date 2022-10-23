package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010853 Constant sequence: a(n) = 14.
 * @author Sean A. Irvine
 */
public class A010853 extends Sequence0 {

  private static final Z FOURTEEN = Z.valueOf(14);

  @Override
  public Z next() {
    return FOURTEEN;
  }
}

