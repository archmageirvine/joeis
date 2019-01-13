package irvine.oeis.a008;

import irvine.math.z.Eulerian2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008517.
 * @author Sean A. Irvine
 */
public class A008517 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Eulerian2.SINGLETON.get(mN, mM);
  }
}

