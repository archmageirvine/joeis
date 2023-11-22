package irvine.oeis.a066;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A066867.
 * @author Sean A. Irvine
 */
public class A066884 extends Sequence0 {

  private final List<Z> mA = new ArrayList<>();
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mA.add(Z.ONE.shiftLeft(mA.size() + 1).subtract(1));
      mM = mA.size() - 1;
    } else {
      mA.set(mM, ZUtils.swizzle(mA.get(mM)));
    }
    return mA.get(mM);
  }
}

