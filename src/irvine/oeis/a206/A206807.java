package irvine.oeis.a206;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.math.z.Z;
import irvine.oeis.a056.A056576;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A206807 Position of 3^n when {2^j} and {3^k} are jointly ranked; complement of A206805.
 * @author Georg Fischer
 */
public class A206807 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A206807() {
    super(1, new A056576().skip(1), (n, v) -> Z.valueOf(n).add(v));
  }
}
