package irvine.oeis.a257;
// Generated by gen_seq4.pl 2024-01-15/simtraf at 2024-01-17 19:19

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a007.A007623;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A257511 Number of 1's in factorial base representation of n (A007623).
 * @author Georg Fischer
 */
public class A257511 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A257511() {
    super(0, new A007623(), (k, v) -> Z.valueOf(ZUtils.digitCounts(v)[1]));
  }
}
