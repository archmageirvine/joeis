package irvine.oeis.a064;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.InfinitaryAliquotSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A064379.
 * @author Sean A. Irvine
 */
public class A064380 extends Sequence2 {

  private int mN = 1;
  private final List<Set<Z>> mB = new ArrayList<>();
  {
    mB.add(Collections.emptySet()); // 1
  }

  private boolean is(final Set<Z> s, final List<Z> a) {
    for (final Z n : a) {
      if (!Z.ONE.equals(n) && s.contains(n)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final List<Z> infinitaryDivisors = InfinitaryAliquotSequence.infinitaryDivisors(Jaguar.factor(++mN));
    long cnt = 0;
    for (final Set<Z> s : mB) {
      if (is(s, infinitaryDivisors)) {
        ++cnt;
      }
    }
    mB.add(new HashSet<>(infinitaryDivisors));
    return Z.valueOf(cnt);
  }
}
