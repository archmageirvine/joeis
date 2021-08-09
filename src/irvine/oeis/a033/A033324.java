package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033324 a(n) = floor(4/n).
 * @author Sean A. Irvine
 */
public class A033324 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.FOUR.divide(++mN);
  }
}

