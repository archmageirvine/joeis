package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073926 Powers of 2 rearranged so that every partial sum after 1 is a proper prime power.
 * @author Sean A. Irvine
 */
public class A073926 extends Sequence1 {

  private final HashSet<Integer> mUsed = new HashSet<>();
  private Z mSum = null;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
      return Z.ONE;
    }
    int k = 0;
    while (true) {
      if (!mUsed.contains(++k)) {
        final Z t = mSum.setBit(k);
        if (Predicates.NONTRIVIAL_PRIME_POWER.is(t)) {
          mSum = t;
          mUsed.add(k);
          return Z.ONE.shiftLeft(k);
        }
      }
    }
  }
}

