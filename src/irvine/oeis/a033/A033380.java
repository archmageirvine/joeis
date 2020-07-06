package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033380 <code>[ 60/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033380 implements Sequence {

  private static final Z NUM = Z.valueOf(60);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

