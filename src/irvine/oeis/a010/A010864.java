package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010864 Constant sequence: a(n) = 25.
 * @author Sean A. Irvine
 */
public class A010864 extends Sequence0 {

  private static final Z N = Z.valueOf(25);

  @Override
  public Z next() {
    return N;
  }
}

