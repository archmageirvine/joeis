package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033341 a(n) = floor(21/n).
 * @author Sean A. Irvine
 */
public class A033341 implements Sequence {

  private static final Z NUM = Z.valueOf(21);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

