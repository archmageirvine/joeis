package irvine.oeis.a348;
// manually 2025-04-01 direct

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a005.A005940;
import irvine.oeis.a322.A322993;

/**
 * A348717 a(n) is the least k such that A003961^i(k) = n for some i &gt;= 0 (where A003961^i denotes the i-th iterate of A003961).
 * @author Georg Fischer
 */
public class A348717 extends AbstractSequence implements DirectSequence {

  private int mN;
  private static final DirectSequence A005940 = new A005940();
  private static final DirectSequence A322993 = new A322993();

  /** Construct the sequence. */
  public A348717() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final Z n) {
    return A005940.a(A322993.a(n).add(1));
  }

  @Override
  public Z a(final int n) {
    return A005940.a(A322993.a(n).add(1));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
