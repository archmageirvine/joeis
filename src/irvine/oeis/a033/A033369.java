package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033369 <code>[ 49/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033369 implements Sequence {

  private static final Z NUM = Z.valueOf(49);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

