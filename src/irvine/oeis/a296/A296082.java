package irvine.oeis.a296;
// Generated by gen_seq4.pl 2023-09-29/gcd3an at 2023-10-03 20:19

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a032.A032741;
import irvine.oeis.a039.A039653;

/**
 * A296082 a(1) = 0; for n &gt; 1, a(n) = A032741(n) / gcd(A039653(n),A032741(n)).
 * @author Georg Fischer
 */
public class A296082 extends AbstractSequence {

  private int mN = 0;
  private final AbstractSequence mSeq1 = new A032741().skip(2);
  private final AbstractSequence mSeq2 = new A039653().skip(2);

  /** Construct the sequence. */
  public A296082() {
    super(1);
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ZERO : new Q(mSeq1.next(), mSeq2.next()).num();
  }
}

