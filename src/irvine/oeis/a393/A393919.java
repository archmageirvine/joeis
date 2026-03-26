package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a391.A391625;

/**
 * A393919 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A393919 extends A391625 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (!Predicates.SQUARE_FREE.is(mN) && Functions.RAD.z(t).equals(Functions.RAD.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
