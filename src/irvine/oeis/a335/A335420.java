package irvine.oeis.a335;
// Generated by gen_seq4.pl known/simtraf at 2023-11-06 12:44

import irvine.math.z.Z;
import irvine.oeis.a163.A163511;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A335420 a(n) = A000120(A163511(n)).
 * @author Georg Fischer
 */
public class A335420 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A335420() {
    super(0, new A163511(), v -> Z.valueOf(v.bitCount()));
  }
}
