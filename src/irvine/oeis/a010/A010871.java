package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010871 Constant sequence: a(n) = 32.
 * @author Sean A. Irvine
 */
public class A010871 extends Sequence0 {

  private static final Z N = Z.valueOf(32);

  @Override
  public Z next() {
    return N;
  }
}

