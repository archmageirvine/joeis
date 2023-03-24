package irvine.oeis.a064;
// manually simple3 at 2023-03-23 23:36

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007917;

/**
 * A064722 a(1) = 0; for n &gt;= 2, a(n) = n - (largest prime &lt;= n).
 * @author Georg Fischer
 */
public class A064722 extends AbstractSequence {

  private int mN = 0;
  private final A007917 mSeq = new A007917();

  /** Construct the sequence. */
  public A064722() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 1) ? Z.ZERO : Z.valueOf(mN).subtract(mSeq.next());
  }
}
