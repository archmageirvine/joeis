package irvine.oeis.a073;

import java.util.ArrayList;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a036.A036275;

/**
 * A073761 Primitive numbers whose decimal expansion of 1/n is equidistributed in base 10.
 * @author Sean A. Irvine
 */
public class A073761 extends Sequence1 {

  private final Sequence mSeq = new A036275();
  private final List<Long> mA = new ArrayList<>();
  private long mN = 0;

  private boolean isPrimitive(final long n) {
    for (final long v : mA) {
      if (n % v == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z periodicPart = mSeq.next();
      if (!periodicPart.isZero()) {
        final int[] cnts = ZUtils.digitCounts(periodicPart);
        if (IntegerUtils.isConstant(cnts) && isPrimitive(mN)) {
          mA.add(mN);
          return Z.valueOf(mN);
        }
      }
    }
  }
}
