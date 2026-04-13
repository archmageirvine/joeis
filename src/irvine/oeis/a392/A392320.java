package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392320 allocated for Patrick J. Millican.
 * @author Sean A. Irvine
 */
public class A392320 extends Sequence1 {

  // ContTanh[n_, mx_] := Block[{k = 0, x = n, lmt = mx + 1, s, lst = {}}, While[k < lmt, s = Floor[x]; x = ArcTanh[x - s]; If[s > 0, AppendTo[lst, k] ]; k++]; lst]; ContTanh[Pi, 100000]

  private long mK = -1;
  private CR mX = CR.PI;

  @Override
  public Z next() {
    while (true) {
      ++mK;
      final Z s = mX.floor();
      mX = ComputableReals.SINGLETON.atanh(mX.subtract(s));
      if (!s.isZero()) {
        return Z.valueOf(mK);
      }
    }
  }
}
