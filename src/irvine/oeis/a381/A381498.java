package irvine.oeis.a381;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A381498 a(n) = sum of numbers k &lt;= n that have the same squarefree kernel as n.
 * @author Sean A. Irvine
 */
public class A381498 extends Sequence1 {

  private long mN = 0;
  private final HashMap<Long, Z> mProducts = new HashMap<>();

  @Override
  public Z next() {
    final long sqfk = Functions.SQUARE_FREE_KERNEL.l(++mN);
    return mProducts.merge(sqfk, Z.valueOf(mN), Z::add);
  }
}
