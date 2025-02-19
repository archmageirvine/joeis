package irvine.oeis.a071;
// Generated by gen_seq4.pl 2024-04-05/simtraf at 2024-04-05 23:22

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071633 Number of terms in the set InvPhi(65536*prime(n)), where prime(n) is the n-th prime.
 * @author Georg Fischer
 */
public class A071633 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071633() {
    super(1, new A000040(), p -> Z.valueOf(InverseEuler.inversePhi(p.multiply(65536)).size()));
  }
}
