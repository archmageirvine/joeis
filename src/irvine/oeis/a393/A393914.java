package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001414;
import irvine.oeis.a008.A008472;

/**
 * A393914 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A393914 extends Sequence1 {

  private final Sequence mA = new A008472();
  private final Sequence mB = new A001414();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.GCD.z(mA.next(), mB.next()).isOne()) {
        return Z.valueOf(mN);
      }
    }
  }
}
