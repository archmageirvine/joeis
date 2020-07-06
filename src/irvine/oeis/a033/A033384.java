package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033384 <code>[ 64/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033384 implements Sequence {

  private static final Z NUM = Z.valueOf(64);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

