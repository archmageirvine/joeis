package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010863 Constant sequence: a(n) = 24.
 * @author Sean A. Irvine
 */
public class A010863 extends Sequence0 {

  private static final Z N = Z.valueOf(24);

  @Override
  public Z next() {
    return N;
  }
}

