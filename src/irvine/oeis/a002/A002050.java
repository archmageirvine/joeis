package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002050 Number of simplices in barycentric subdivision of n-simplex.
 * @author Sean A. Irvine
 */
public class A002050 extends Sequence0 {

  private int mN = -1;
  private final ArrayList<Z> mS = new ArrayList<>();

  @Override
  public Z next() {
    if (++mN == 0) {
      mS.add(Z.ZERO);
    } else {
      mS.add(mS.get(mN - 1).multiply2().add(1));
    }
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      final Z t = Functions.STIRLING2.z(mN, k).multiply(Functions.FACTORIAL.z(k)).multiply(mS.get(k));
      s = s.signedAdd((k & 1) == 0, t);
    }
    return s.abs();
  }
}
