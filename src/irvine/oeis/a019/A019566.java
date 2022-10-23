package irvine.oeis.a019;

import irvine.factor.project.smarandache.Smarandache;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019566 The differences 1-1, 21-12, 321-123, ..., 10987654321-12345678910, 1110987654321-1234567891011, etc.
 * @author Sean A. Irvine
 */
public class A019566 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Smarandache.reverseSmarandacheZ(++mN).subtract(Smarandache.smarandacheZ(mN));
  }
}
