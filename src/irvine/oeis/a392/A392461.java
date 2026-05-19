package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a393.A393905;

/**
 * A392461 a(n) is the minimum diameter of a n-element set of integers for which no nonzero d has more than 2 representations as a difference of elements of the set.
 * @author Sean A. Irvine
 */
public class A392461 extends A393905 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(2, ++mN);
  }
}
