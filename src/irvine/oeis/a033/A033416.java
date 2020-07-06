package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033416 <code>[ 96/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033416 implements Sequence {

  private static final Z NUM = Z.valueOf(96);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

