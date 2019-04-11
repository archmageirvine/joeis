package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010871 Constant sequence: <code>a(n) = 32</code>.
 * @author Sean A. Irvine
 */
public class A010871 implements Sequence {

  private static final Z N = Z.valueOf(32);

  @Override
  public Z next() {
    return N;
  }
}

