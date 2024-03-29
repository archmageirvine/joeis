package irvine.oeis.a072;
// Generated by gen_seq4.pl 2023-10-16/filtpos at 2023-10-17 20:49

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a049.A049605;

/**
 * A072862 The smallest k&gt;1 such that k divides sigma(k*n) is equal to 6.
 * @author Georg Fischer
 */
public class A072862 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072862() {
    super(1, 1, new A049605(), v -> v.equals(Z.SIX));
  }
}
