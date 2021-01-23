package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033361 a(n) = floor(41/n).
 * @author Sean A. Irvine
 */
public class A033361 implements Sequence {

  private static final Z NUM = Z.valueOf(41);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

