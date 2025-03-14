package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073874 A073872(n)/n.
 * @author Sean A. Irvine
 */
public class A073874 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (Functions.TRIANGULAR.z(++k).mod(mN) != 0 || !mUsed.add(k)) {
      // do nothing
    }
    return Functions.TRIANGULAR.z(k).divide(mN);
  }
}
