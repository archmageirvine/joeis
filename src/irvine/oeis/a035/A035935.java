package irvine.oeis.a035;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035935 Smallest number that always takes at least n steps to reach 0 under "k -&gt; any product of 2 numbers whose concatenation is k".
 * @author Sean A. Irvine
 */
public class A035935 extends Sequence0 {

  private final List<TreeSet<Integer>> mSteps = new ArrayList<>();
  {
    mSteps.add(new TreeSet<>(Collections.singleton(0)));
  }
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    int c = -1;
    while (true) {
      if (++c >= mSteps.size()) {
        final int n = mSteps.size();
        final TreeSet<Integer> steps = new TreeSet<>();
        mSteps.add(steps);
        if (n < 100) {
          for (final int s : mSteps.get((n / 10) * (n % 10))) {
            steps.add(1 + s);
          }
        } else {
          final String str = String.valueOf(n);
          for (int k = 1; k < str.length(); ++k) {
            for (final int s : mSteps.get(Integer.parseInt(str.substring(0, k)) * Integer.parseInt(str.substring(k)))) {
              steps.add(1 + s);
            }
          }
        }
        //System.out.println("Computed " + n + " -> " + mSteps.get(n));
      }
      if (mSteps.get(c).first() >= mN) {
        return Z.valueOf(c);
      }
    }
  }
}

