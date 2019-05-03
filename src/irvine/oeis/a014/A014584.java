package irvine.oeis.a014;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014584 Number of Hamiltonian paths in a <code>5 X n</code> grid starting at the lower left corner and finishing in the upper right corner.
 * @author Sean A. Irvine
 */
public class A014584 implements Sequence {

  private final class FFunction extends MemoryFunction1<Z> {
    @Override
    protected Z compute(final int n) {
      if (n <= 2) {
        return n == 0 ? Z.ZERO : Z.ONE;
      }
      return mF2.get(n).add(mF4.get(n - 2)).add(get(n - 2));
    }
  }

  private final class F2Function extends MemoryFunction1<Z> {
    @Override
    protected Z compute(final int n) {
      return n <= 2 ? Z.ONE : mF14.get(n).add(get(n - 1)).add(mG.get(n - 1)).add(mH.get(n - 1)).add(mF4.get(n - 2));
    }
  }

  private final class F4Function extends MemoryFunction1<Z> {
    @Override
    protected Z compute(final int n) {
      if (n <= 2) {
        return n == 1 ? Z.ONE : Z.ZERO;
      }
      return mF14.get(n).add(mG.get(n - 1)).add(mF.get(n - 2)).add(get(n - 2).multiply2());
    }
  }

  private final class F14Function extends MemoryFunction1<Z> {
    @Override
    protected Z compute(final int n) {
      return n <= 2 ? Z.ZERO : get(n - 1).add(mF.get(n - 2)).add(mF2.get(n - 2)).add(mG2.get(n - 2)).add(mH.get(n - 2));
    }
  }

  protected final class GFunction extends MemoryFunction1<Z> {
    @Override
    protected Z compute(final int n) {
      if (n <= 2) {
        return n == 2 ? Z.ONE : Z.ZERO;
      }
      return mG2.get(n).add(mG4.get(n - 2)).add(get(n - 2));
    }
  }

  private final class G2Function extends MemoryFunction1<Z> {
    @Override
    protected Z compute(final int n) {
      if (n <= 2) {
        return n == 2 ? Z.ONE : Z.ZERO;
      }
      return mG14.get(n).add(get(n - 1)).add(mF.get(n - 1)).add(mH.get(n - 1)).add(mG4.get(n - 2));
    }
  }

  private final class G4Function extends MemoryFunction1<Z> {
    @Override
    protected Z compute(final int n) {
      if (n <= 2) {
        return n == 2 ? Z.ONE : Z.ZERO;
      }
      return mG14.get(n).add(mF.get(n - 1)).add(mG.get(n - 2)).add(get(n - 2).multiply2());
    }
  }

  private final class G14Function extends MemoryFunction1<Z> {
    @Override
    protected Z compute(final int n) {
      return n <= 2 ? Z.ZERO : get(n - 1).add(mG.get(n - 2)).add(mG2.get(n - 2)).add(mF2.get(n - 2)).add(mH.get(n - 2));
    }
  }

  private final class HFunction extends MemoryFunction1<Z> {
    @Override
    protected Z compute(final int n) {
      if (n <= 2) {
        return n == 2 ? Z.ONE : Z.ZERO;
      }
      return mF.get(n - 1).add(mG.get(n - 1)).add(get(n - 1));
    }
  }

  private int mN = -1;
  private final FFunction mF = new FFunction();
  private final F2Function mF2 = new F2Function();
  private final F4Function mF4 = new F4Function();
  private final F14Function mF14 = new F14Function();
  protected final GFunction mG = new GFunction();
  private final G2Function mG2 = new G2Function();
  private final G4Function mG4 = new G4Function();
  private final G14Function mG14 = new G14Function();
  private final HFunction mH = new HFunction();

  @Override
  public Z next() {
    return mF.get(++mN);
  }
}
