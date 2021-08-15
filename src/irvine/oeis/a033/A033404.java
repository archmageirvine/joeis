package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033404 a(n) = floor(84/n).
 * @author Sean A. Irvine
 */
public class A033404 implements Sequence {

  private static final Z NUM = Z.valueOf(84);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

