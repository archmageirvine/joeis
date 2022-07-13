package irvine.oeis.a057;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005351;
import irvine.oeis.a005.A005352;

/**
 * A057892 Negabinary numbral addition table.
 * @author Sean A. Irvine
 */
public class A057892 implements Sequence {

  private long mN = -1;
  private long mM = 0;
  private long mR = -1;
  private final Sequence mNonNeg = new A005351();
  private final Sequence mNeg = new A005352();
  private final HashMap<Long, Long> mToNegBinary = new HashMap<>();
  private final HashMap<Long, Long> mToNatural = new HashMap<>();

  private void step() {
    ++mR;
    final long nb = mNonNeg.next().longValueExact();
    mToNegBinary.put(mR, nb);
    mToNatural.put(nb, mR);
    final long nnb = mNeg.next().longValueExact();
    mToNegBinary.put(-mR - 1, nnb);
    mToNatural.put(nnb, -mR - 1);
  }

  protected long getNegBinary(final long n) {
    while (!mToNegBinary.containsKey(n)) {
      step();
    }
    return mToNegBinary.get(n);
  }

  protected long getNatural(final long n) {
    while (!mToNatural.containsKey(n)) {
      step();
    }
    return mToNatural.get(n);
  }

  protected long t(final long a, final long b) {
    return getNegBinary(getNatural(a) + getNatural(b));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mM, mN - mM));
  }
}

