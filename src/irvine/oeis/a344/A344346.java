package irvine.oeis.a344;
// Generated by gen_seq4.pl filtpos at 2023-09-08 10:19

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a050.A050605;

/**
 * A344346 Numbers k which have an odd number of trailing zeros in their binary reflected Gray code A014550(k).
 * @author Georg Fischer
 */
public class A344346 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A344346() {
    super(1, 0, new A050605(), ODD);
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
