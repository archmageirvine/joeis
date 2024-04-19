package irvine.oeis.a125;
// manually robot/nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a032.A032741;

/**
 * A125168 a(n) = gcd(n, A032741(n)) where A032741(n) is the number of proper divisors of n.
 * @author Georg Fischer
 */
public class A125168 extends AbstractSequence {

  private int mN;
  private final A032741 mSeq1 = new A032741();

  /** Construct the sequence. */
  public A125168() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).gcd(mSeq1.next());
  }
}
