package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.a393.A393905;

/**
 * A395265 a(n) is the minimum diameter of an n-element set of integers for which no nonzero d has more than 5 representations as a difference of elements of the set.
 * @author Sean A. Irvine
 */
public class A395265 extends A393905 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(5, ++mN);
  }
}
