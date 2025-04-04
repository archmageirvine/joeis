package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073877 Smallest Bell number divisible by n not included earlier, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A073877 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  protected long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 7) == 0) {
      return Z.ZERO;
    }
    long k = 0;
    while (Functions.BELL.z(++k).mod(mN) != 0 || !mUsed.add(k)) {
      // do nothing
    }
    return Functions.BELL.z(k);
  }
}
