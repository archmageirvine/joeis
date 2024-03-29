package irvine.oeis.a240;
// Generated by gen_seq4.pl 2023-10-16/filtpos at 2023-10-17 20:49

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a069.A069904;

/**
 * A240529 Indices of 9-almost prime triangular numbers.
 * @author Georg Fischer
 */
public class A240529 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A240529() {
    super(1, 1, new A069904(), v -> v.equals(Z.NINE));
  }
}
