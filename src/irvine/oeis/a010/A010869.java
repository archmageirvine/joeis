package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010869 Constant sequence: a(n) = 30.
 * @author Sean A. Irvine
 */
public class A010869 implements Sequence {

  private static final Z N = Z.valueOf(30);

  @Override
  public Z next() {
    return N;
  }
}

