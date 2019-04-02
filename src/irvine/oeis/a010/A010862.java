package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010862 Constant sequence: a(n) = 23.
 * @author Sean A. Irvine
 */
public class A010862 implements Sequence {

  private static final Z N = Z.valueOf(23);

  @Override
  public Z next() {
    return N;
  }
}

