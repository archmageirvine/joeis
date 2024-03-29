package irvine.oeis.a322;
// Generated by gen_seq4.pl known/simtraf at 2023-11-06 12:44

import irvine.math.z.Z;
import irvine.oeis.a122.A122111;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A322867 a(n) = A000120(A122111(n)).
 * @author Georg Fischer
 */
public class A322867 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A322867() {
    super(1, new A122111(), v -> Z.valueOf(v.bitCount()));
  }
}
