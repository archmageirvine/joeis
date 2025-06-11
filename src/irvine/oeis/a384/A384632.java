package irvine.oeis.a384;

import java.util.LinkedList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A384632 allocated for Gavin Lupo.
 * @author Sean A. Irvine
 */
public class A384632 extends Sequence0 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private final LinkedList<Byte> mS = new LinkedList<>();

  @Override
  public Z next() {
    if (mS.isEmpty()) {
      mS.add((byte) 0);
      return Z.ZERO;
    }
    final long d = mS.pollFirst();
    long m = 0;
    while (true) {
      if (!mUsed.isSet(++m) && Functions.SIGMA0.l(m) >= d) {
        mUsed.set(m);
        final String t = String.valueOf(m);
        for (int k = 0; k < t.length(); ++k) {
          mS.add((byte) (t.charAt(k) - '0'));
        }
        return Z.valueOf(m);
      }
    }
  }
}
