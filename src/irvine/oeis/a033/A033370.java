package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033370 <code>[ 50/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033370 implements Sequence {

  private static final Z NUM = Z.valueOf(50);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

