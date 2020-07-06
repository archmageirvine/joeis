package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033328 <code>[ 8/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033328 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.EIGHT.divide(++mN);
  }
}

