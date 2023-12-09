package irvine.oeis.a202;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a067.A067210;

/**
 * A202784 T(n,k) is the number of n X n 0..k arrays with row and column sums equal.
 * @author Sean A. Irvine
 */
public class A202784 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final ArrayList<Sequence> mA = new ArrayList<>();

  @Override
  public Z next() {
    if (++mM >= mN) {
      mA.add(new A067210(1, ++mN));
      mM = 0;
    }
    return mA.get(mN - mM - 1).next();
  }
}
