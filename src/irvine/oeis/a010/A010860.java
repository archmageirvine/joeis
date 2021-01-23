package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010860 Constant sequence: a(n) = 21.
 * @author Sean A. Irvine
 */
public class A010860 implements Sequence {

  private static final Z N = Z.valueOf(21);

  @Override
  public Z next() {
    return N;
  }
}

