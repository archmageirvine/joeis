package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393845 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A393845 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int syn = Functions.SYNDROME.i(mN);
    long k = ++mN;
    while ((syn & Functions.SYNDROME.i(k)) != syn) {
      k += mN;
    }
    return Z.valueOf(k);
  }
}
