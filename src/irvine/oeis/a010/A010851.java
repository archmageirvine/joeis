package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010851 Constant sequence: a(n) = 12.
 * @author Sean A. Irvine
 */
public class A010851 extends Sequence0 {

  private static final Z TWELVE = Z.valueOf(12);

  @Override
  public Z next() {
    return TWELVE;
  }
}

