package irvine.oeis.a393;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A393474 Row sums of A393016.
 * @author Sean A. Irvine
 */
public class A393474 extends A393016 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, k -> super.next());
  }
}
