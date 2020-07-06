package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033375 <code>[ 55/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033375 implements Sequence {

  private static final Z NUM = Z.valueOf(55);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

