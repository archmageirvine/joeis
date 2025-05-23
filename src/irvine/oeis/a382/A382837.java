package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-04-15.ack/filtpos at 2025-04-15 19:24

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a071.A071324;

/**
 * A382837 Numbers k such that k - A071324(k) &gt; A000010(k).
 * @author Georg Fischer
 */
public class A382837 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A382837() {
    super(1, 1, new A071324(), (k, v) -> Z.valueOf(k).subtract(v).compareTo(Functions.PHI.z(k)) > 0);
  }
}
