package irvine.oeis.a239;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A239619 Base 3 sum of digits of prime(n).
 * @author Georg Fischer
 */
public class A239619 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A239619() {
    super(1, new A000040(), v -> Z.valueOf(ZUtils.digitSum(v, 3)));
  }
}
