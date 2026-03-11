package irvine.oeis.a393;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393923 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A393923 extends Sequence1 {

  private long mN = 0;
  private final HashMap<Long, Z> mProducts = new HashMap<>();

  @Override
  public Z next() {
    final long sqfk = Functions.SQUARE_FREE_KERNEL.l(++mN);
    return mProducts.merge(sqfk, Z.valueOf(mN), Z::multiply);
  }
}
