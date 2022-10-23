package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010861 Constant sequence: a(n) = 22.
 * @author Sean A. Irvine
 */
public class A010861 extends Sequence0 {

  private static final Z N = Z.valueOf(22);

  @Override
  public Z next() {
    return N;
  }
}

