package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A057168 Next larger integer with same binary weight (number of 1 bits) as n.
 * @author Sean A. Irvine
 */
public class A057168 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SWIZZLE.z(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.SWIZZLE.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.SWIZZLE.z(n);
  }
}

