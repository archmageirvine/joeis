package irvine.oeis.a322;
// manually 2025-04-01 direct

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a156.A156552;

/**
 * A322993 a(1) = 0; for n &gt; 1, a(n) = A000265(A156552(n)).
 * @author Georg Fischer
 */
public class A322993 extends AbstractSequence implements DirectSequence {

  private int mN;
  private static final DirectSequence A156552 = new A156552();

  /** Construct the sequence. */
  public A322993() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final Z n) {
    return n.equals(Z.ONE) ? Z.ZERO : Functions.MAKE_ODD.z(A156552.a(n));
  }

  @Override
  public Z a(final int n) {
    return n == 1 ? Z.ZERO : Functions.MAKE_ODD.z(A156552.a(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
