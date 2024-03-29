package irvine.oeis.a257;
// Generated by gen_seq4.pl 2024-01-16/simtraf at 2024-01-19 19:57

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a007.A007623;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A257079 The least nonzero digit missing from the factorial representation (A007623) of n.
 * @author Georg Fischer
 */
public class A257079 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A257079() {
    super(0, new A007623(), v -> {
      final int[] c = ZUtils.digitCounts(v, 10);
      int i = 0;
      while (++i <= 9) {
        if (c[i] == 0) {
          return Z.valueOf(i);
        }
      }
      return Z.NEG_ONE;
    });
  }
}
