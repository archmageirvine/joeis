package irvine.oeis.a358;
// Generated by gen_seq4.pl 2023-10-16/simtraf at 2023-10-17 20:49

import irvine.math.z.Z;
import irvine.oeis.a349.A349905;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A358753 a(n) = 1 if bigomega(n) == 3 (mod 4), otherwise 0.
 * @author Georg Fischer
 */
public class A358753 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A358753() {
    super(1, new A349905(), v -> (v.mod(4) == 3) ? Z.ONE : Z.ZERO);
  }
}
