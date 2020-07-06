package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033339 <code>[ 19/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033339 implements Sequence {

  private static final Z NUM = Z.valueOf(19);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

