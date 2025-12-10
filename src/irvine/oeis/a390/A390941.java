package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;

/**
 * A390941 "Late birds" in A390939: terms A390939(m) such that A390939(k) &gt; A390939(m) for all k &gt; m, where A390939 lists the keys added in the map initialized with T[1] = 1 and then repeatedly T[v] := k + (T[v] if defined else 0) for all key-value pairs (k, v) in T.
 * @author Sean A. Irvine
 */
public class A390941 extends PrependSequence {

  private static final Z Z961 = Z.valueOf(961);

  /** Construct the sequence. */
  public A390941() {
    super(1, new Sequence1() {
      private long mN = 4;
      @Override
      public Z next() {
        return Z961.shiftLeft(++mN);
      }
    }, 1, 2, 4, 6, 26, 52, 54, 66, 68, 72, 116, 232, 464, 928, 1856, 1922, 3842, 5764, 15372, 15376, 30744, 30752);
  }
}
