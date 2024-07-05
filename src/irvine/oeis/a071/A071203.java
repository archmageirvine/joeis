package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071203 Integer part of n divided by its largest digit (decimal notation).
 * @author Sean A. Irvine
 */
public class A071203 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN / (Functions.DIGIT_SORT_ASCENDING.l(mN) % 10));
  }
}
