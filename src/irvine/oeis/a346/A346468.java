package irvine.oeis.a346;
// Generated by gen_seq4.pl 2023-10-03/simtraf at 2023-10-03 13:40

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A346468 a(n) = (n-1) / A346467(n).
 * @author Georg Fischer
 */
public class A346468 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A346468() {
    super(1, new A346467(), (n, v) -> Z.valueOf(n - 1).divide(v));
  }
}
