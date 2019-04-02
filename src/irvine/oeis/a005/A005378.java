package irvine.oeis.a005;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005378 The female of a pair of recurrences.
 * @author Sean A. Irvine
 */
public class A005378 extends MemoryFunction1<Z> implements Sequence {

  static final class Male extends MemoryFunction1<Z> {

    private final A005378 mFemale;

    private Male(final A005378 female) {
      mFemale = female;
    }

    @Override
    protected Z compute(final int n) {
      if (n == 0) {
        return Z.ZERO;
      }
      return Z.valueOf(n).subtract(mFemale.get(get(n - 1).intValueExact()));
    }
  }

  protected final Male mMale = new Male(this);
  private int mN = -1;

  @Override
  protected Z compute(final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    return Z.valueOf(n).subtract(mMale.get(get(n - 1).intValueExact()));
  }

  protected Z getTerm(final int n) {
    return get(n);
  }

  @Override
  public Z next() {
    return getTerm(++mN);
  }

}
