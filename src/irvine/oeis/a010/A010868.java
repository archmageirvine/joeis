package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010868 Constant sequence: a(n) = 29.
 * @author Sean A. Irvine
 */
public class A010868 extends Sequence0 {

  private static final Z N = Z.valueOf(29);

  @Override
  public Z next() {
    return N;
  }
}

