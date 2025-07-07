package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007489;

/**
 * A078619 Floor(average of first n factorials).
 * @author Sean A. Irvine
 */
public class A078619 extends Sequence1 {

  private final Sequence mSum = new A007489().skip();
  private long mN = 0;

  @Override
  public Z next() {
    return mSum.next().divide(++mN);
  }
}

