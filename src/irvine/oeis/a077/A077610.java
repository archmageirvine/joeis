package irvine.oeis.a077;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077610 Triangle in which n-th row lists unitary divisors of n.
 * @author Sean A. Irvine
 */
public class A077610 extends Sequence1 {

  private long mN = 0;
  private int mM = 0;
  private List<Z> mA = Collections.emptyList();

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA = new ArrayList<>();
      for (final Z d : Jaguar.factor(++mN).divisors()) {
        if (Functions.GCD.l(d, mN / d.longValueExact()) == 1) {
          mA.add(d);
        }
      }
      Collections.sort(mA);
      mM = 0;
    }
    return mA.get(mM);
  }
}
