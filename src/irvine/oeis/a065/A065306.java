package irvine.oeis.a065;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A065306 The Goldbach permutation: take A065305, cross out repetitions and subtract 2 from each term.
 * @author Sean A. Irvine
 */
public class A065306 extends Sequence1 {

  private final Sequence mA = new A065305();
  private final HashSet<Z> mSeen = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next();
      if (mSeen.add(t)) {
        return t.subtract(2);
      }
    }
  }
}
