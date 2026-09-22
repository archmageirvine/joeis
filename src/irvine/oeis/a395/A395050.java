package irvine.oeis.a395;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001055;
import irvine.oeis.a025.A025487;

/**
 * A395050 allocated for Zhicheng Wei.
 * @author Sean A. Irvine
 */
public class A395050 extends A001055 {

  private static final List<Z> EMPTY = Collections.emptyList();
  private final Sequence mS = new A025487();
  private int mRowLength = super.next().intValueExact();
  private final HashMap<Integer, List<Z>> mA = new HashMap<>();
  private int mN = 1;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM >= mRowLength) {
      ++mN;
      mRowLength = super.next().intValueExact();
      mM = 0;
    }
    while (mA.getOrDefault(mN, EMPTY).size() != mRowLength) {
      final Z t = mS.next();
      final int s = Functions.SIGMA0.i(t);
      mA.computeIfAbsent(s, k -> new ArrayList<>()).add(t);
    }
    return mA.get(mN).get(mM);
  }
}
