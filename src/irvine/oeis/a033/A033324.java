package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033324 <code>[ 4/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033324 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.FOUR.divide(++mN);
  }
}

