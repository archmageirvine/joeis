package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019520 a(n) is the concatenation of the first n positive even numbers.
 * @author Sean A. Irvine
 */
public class A019520 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mN += 2;
    mS.append(mN);
    return new Z(mS);
  }
}

