package irvine.oeis.a280;

import irvine.math.z.Z;
import irvine.oeis.a000.A000078;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A280426 Digital roots of tetranacci numbers A000078.
 * @author Georg Fischer
 */
public class A280426 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A280426() {
    super(0, new A000078(), v -> v.isZero() ? Z.ZERO : v.add(8).mod(Z.NINE).add(1));
  }
}
