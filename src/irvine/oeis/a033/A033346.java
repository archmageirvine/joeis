package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033346 <code>[ 26/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033346 implements Sequence {

  private static final Z NUM = Z.valueOf(26);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

