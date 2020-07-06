package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033329 <code>[ 9/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033329 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.NINE.divide(++mN);
  }
}

