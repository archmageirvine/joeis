package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073875 Smallest nonzero Fibonacci number divisible by n not included earlier.
 * @author Sean A. Irvine
 */
public class A073875 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (Functions.FIBONACCI.z(++k).mod(mN) != 0 || !mUsed.add(k)) {
      // do nothing
    }
    return Functions.FIBONACCI.z(k);
  }
}
