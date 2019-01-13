package irvine.oeis.a006;

import irvine.math.z.Eulerian2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006260.
 * @author Sean A. Irvine
 */
public class A006260 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    return Eulerian2.SINGLETON.get(++mN, 3L);
  }
}

