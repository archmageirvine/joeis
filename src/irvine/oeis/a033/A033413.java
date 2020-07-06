package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033413 <code>[ 93/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033413 implements Sequence {

  private static final Z NUM = Z.valueOf(93);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

