package irvine.oeis.a032;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032141 "CFK" (necklace, size, unlabeled) transform of 1,2,3,4...
 * @author Sean A. Irvine
 */
public class A032141 extends Sequence0 {

  private final ArrayList<Z> mA = new ArrayList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(null);
      return Z.ONE;
    }
    mA.add(Z.valueOf(mA.size()));
    return A032010.cfk(mA).get(mA.size() - 1);
  }
}
