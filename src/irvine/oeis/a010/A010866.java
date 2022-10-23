package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010866 Constant sequence: a(n) = 27.
 * @author Sean A. Irvine
 */
public class A010866 extends Sequence0 {

  private static final Z N = Z.valueOf(27);

  @Override
  public Z next() {
    return N;
  }
}

