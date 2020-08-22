package irvine.oeis.a032;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032140 "CFK" (necklace, size, unlabeled) transform of 2,1,1,1...
 * @author Sean A. Irvine
 */
public class A032140 implements Sequence {

  private final ArrayList<Z> mA = new ArrayList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(null);
      return Z.ONE;
    }
    mA.add(mA.size() == 1 ? Z.TWO : Z.ONE);
    return A032010.cfk(mA).get(mA.size() - 1);
  }
}
