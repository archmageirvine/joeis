package irvine.oeis.a019;

import irvine.factor.project.smarandache.Smarandache;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019566.
 * @author Sean A. Irvine
 */
public class A019566 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Smarandache.reverseSmarandacheZ(++mN).subtract(Smarandache.smarandacheZ(mN));
  }
}
