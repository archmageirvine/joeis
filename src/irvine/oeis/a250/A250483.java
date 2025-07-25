package irvine.oeis.a250;
// Generated by gen_seq4.pl 2025-07-26.ack/enumof2 at 2025-07-26 21:09

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A250483 Numbers of the form 3^x + y^3  with x, y &gt;= 0.
 * @author Georg Fischer
 */
public class A250483 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A250483() {
    super(1, 0, 0, (x, y) -> Z.THREE.pow(x).add(Z.valueOf(y).pow(3)));
  }
}
