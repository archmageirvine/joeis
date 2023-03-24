package irvine.oeis.a159;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a020.A020639;

/**
 * A159475 a(1) = 1; for n &gt;= 1, a(n) is the smallest number m &gt; n such that gcd(n,m) &gt; 1.
 * @author Georg Fischer
 */
public class A159475 extends AbstractSequence {

  private int mN = 0;
  private final A020639 mSeq = new A020639();

  /** Construct the sequence. */
  public A159475() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Z.valueOf(mN).add(mSeq.next());
    return (mN == 1) ? Z.ONE : result;
  }
}
