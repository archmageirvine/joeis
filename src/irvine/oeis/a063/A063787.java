package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000120;

/**
 * A063787 a(2^k) = k + 1 and a(2^k + i) = 1 + a(i) for k &gt;= 0 and 0 &lt; i &lt; 2^k.
 * @author Georg Fischer
 */
public class A063787 extends Sequence1 {

  private final Sequence mSeq = new A000120();

  @Override
  public Z next() {
    // a(n) = A000120(n-1) + 1.
    return mSeq.next().add(Z.ONE);
  }
}
