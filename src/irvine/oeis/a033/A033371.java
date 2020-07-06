package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033371 <code>a(n) = floor(51/n)</code>.
 * @author Sean A. Irvine
 */
public class A033371 implements Sequence {

  private static final Z NUM = Z.valueOf(51);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

