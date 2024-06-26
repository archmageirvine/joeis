package irvine.oeis.a358;
// Generated by gen_seq4.pl 2024-06-20/lambdan at 2024-06-20 23:44

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a003.A003961;
import irvine.oeis.a010.A010873;

/**
 * A358752 a(n) = 1 if A349905(n) == 2 (mod 4), otherwise 0.  Here A349905(n) is the arithmetic derivative applied to the prime shifted n.
 * @author Georg Fischer
 */
public class A358752 extends LambdaSequence {

  private static final DirectSequence A003961 = new A003961();
  private static final DirectSequence A010873 = new A010873();

  /** Construct the sequence. */
  public A358752() {
    super(1, n -> Z.THREE.subtract(A010873.a(Functions.BIG_OMEGA.z(n))).equals(A010873.a(A003961.a(n))) ? Z.ONE : Z.ZERO);
  }
}
