package irvine.oeis.a066;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066884 Square array read by upward antidiagonals where the n-th row contains the positive integers with n binary 1's.
 * @author Sean A. Irvine
 */
public class A066884 extends Sequence1 {

  private final List<Z> mA = new ArrayList<>();
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mA.add(Z.ONE.shiftLeft(mA.size() + 1).subtract(1));
      mM = mA.size() - 1;
    } else {
      mA.set(mM, Functions.SWIZZLE.z(mA.get(mM)));
    }
    return mA.get(mM);
  }
}

