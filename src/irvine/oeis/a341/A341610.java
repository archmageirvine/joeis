package irvine.oeis.a341;
// Generated by gen_seq4.pl 2025-03-07.ack/filtpos at 2025-03-07 21:14

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a337.A337345;

/**
 * A341610 Nonprimitive terms of A246282: numbers k that have more than one divisor d|k such that A003961(d) &gt; 2*d.
 * @author Georg Fischer
 */
public class A341610 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A341610() {
    super(1, 1, new A337345(), v -> v.compareTo(Z.ONE) > 0);
  }
}
