package irvine.oeis.a138;
// Generated by gen_seq4.pl 2024-09-12.ack/filtpos at 2024-09-12 20:55

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a116.A116178;

/**
 * A138670 Indices of 0's in Stewart's choral sequence.
 * @author Georg Fischer
 */
public class A138670 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A138670() {
    super(0, 0, new A116178(), v -> v.equals(Z.ZERO));
  }
}
