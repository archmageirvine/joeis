package irvine.oeis.a319;
// Generated by gen_seq4.pl 2024-04-10/simtraf at 2024-04-10 22:07

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a191.A191483;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A319661 2-rank of the class group of imaginary quadratic field with discriminant -k, k = A191483(n).
 * @author Georg Fischer
 */
public class A319661 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A319661() {
    super(1, new A191483(), v -> Z.valueOf(Functions.OMEGA.i(v) - 1));
  }
}
