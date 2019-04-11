package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010864 Constant sequence: <code>a(n) = 25</code>.
 * @author Sean A. Irvine
 */
public class A010864 implements Sequence {

  private static final Z N = Z.valueOf(25);

  @Override
  public Z next() {
    return N;
  }
}

