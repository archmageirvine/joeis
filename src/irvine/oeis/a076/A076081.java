package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A076081 Rearrange numbers from 1 to n: start with the divisors of n in ascending order followed by numbers in ascending order which leave a remainder 1 on dividing by n, followed by those leaving remainder 2 ... up to remainder [(n-1)/2].
 * @author Sean A. Irvine
 */
public class A076081 extends Sequence1 {

  private List<Pair<Integer, Integer>> mA = Collections.emptyList();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mA = new ArrayList<>(mN);
      for (int k = 1; k <= mN; ++k) {
        mA.add(new Pair<>(mN % k, k));
      }
      mA.sort(Comparator.comparingInt((ToIntFunction<Pair<Integer, Integer>>) Pair::left).thenComparingInt(Pair::right));
    }
    return Z.valueOf(mA.get(mM).right());
  }
}
