package irvine.oeis.a080;
// manually 2026-11-06

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004001;

/**
 * A080677 a(n) = n + 1 - A004001(n).
 * @author Georg Fischer
 */
public class A080677 extends Sequence1 implements DirectSequence {

  private static final DirectSequence A004001 = new A004001();
  private int mN;

  /** Construct the sequence. */
  public A080677() {
    mN = 0;
  }

  @Override
  public Z next() {
    return a(++mN);
  }


  @Override
  public Z a(final Z n) {
    return n.add(1).subtract(A004001.a(n));
  }

  @Override
  public Z a(final long n) {
    return Z.valueOf(n + 1).subtract(A004001.a(n));
  }

}
