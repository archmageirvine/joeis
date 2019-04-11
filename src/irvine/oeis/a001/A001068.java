package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001068 <code>a(n) = floor(5*n/4),</code> numbers that are congruent to <code>{0, 1, 2, 3} mod 5</code>.
 * @author Sean A. Irvine
 */
public class A001068 implements Sequence {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.shiftRight(2);
  }
}

