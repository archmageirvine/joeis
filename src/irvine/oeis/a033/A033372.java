package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033372 <code>[ 52/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033372 implements Sequence {

  private static final Z NUM = Z.valueOf(52);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

