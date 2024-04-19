package irvine.oeis.a303;
// manually robot/nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000005;

/**
 * A303781 a(2) = 1; for n &lt;&gt; 2, a(n) = gcd(n, A000005(n)), where A000005(n) = number of divisors of n.
 * @author Georg Fischer
 */
public class A303781 extends AbstractSequence {

  private int mN;
  private final A000005 mSeq1 = new A000005();

  /** Construct the sequence. */
  public A303781() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    final Z t1 = mSeq1.next();
    return (mN == 2) ? Z.ONE : Z.valueOf(mN).gcd(t1);
  }
}
