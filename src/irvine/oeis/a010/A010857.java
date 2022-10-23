package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010857 Constant sequence: a(n) = 18.
 * @author Sean A. Irvine
 */
public class A010857 extends Sequence0 {

  private static final Z EIGHTEEN = Z.valueOf(18);

  @Override
  public Z next() {
    return EIGHTEEN;
  }
}

