package irvine.oeis.a334;

import java.util.LinkedList;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A334676 a(n) is the least number that can be reached starting from n and iterating the nondeterministic map x -&gt; x/d where d is a nonzero digit of x dividing x.
 * @author Sean A. Irvine
 */
public class A334676 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final TreeSet<Long> seen = new TreeSet<>();
    final LinkedList<Long> lst = new LinkedList<>();
    lst.add(++mN);
    seen.add(mN);
    while (!lst.isEmpty()) {
      final long v = lst.pollFirst();
      final int syn = Functions.SYNDROME.i(v);
      for (int d = 1; d < 10; ++d) {
        if ((syn & (1 << d)) != 0 && v % d == 0 && seen.add(v / d)) {
          lst.add(v / d);
        }
      }
    }
    return Z.valueOf(seen.first());
  }
}

