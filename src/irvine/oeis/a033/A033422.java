package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033422 a(n) = floor(10000/n).
 * @author Sean A. Irvine
 */
public class A033422 implements Sequence {

  private static final Z NUM = Z.valueOf(10000);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

