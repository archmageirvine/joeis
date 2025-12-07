package irvine.oeis.a082;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082386 Let S(0) = {1} and for k &gt;= 1, let S(k) = {S(k-1), S(k-1), 2T}, where T = sum of terms in S(k-1). Sequence is S(infinity).
 * @author Sean A. Irvine
 */
public class A082386 extends Sequence0 {

  private int mN = -1;
  private final List<Z> mA = new ArrayList<>();
  {
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    if (++mN >= mA.size()) {
      final Z s = Functions.SUM.z(mA);
      mA.addAll(mA);
      mA.add(s.multiply2());
    }
    return mA.get(mN);
  }
}
