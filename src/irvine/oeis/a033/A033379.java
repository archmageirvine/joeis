package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033379 a(n) = floor(59/n).
 * @author Sean A. Irvine
 */
public class A033379 implements Sequence {

  private static final Z NUM = Z.valueOf(59);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

