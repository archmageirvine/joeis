package irvine.oeis.a333;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a078.A078471;

/**
 * A333194 a(n) = Sum_{k=1..n} (ceiling(n/k) mod 2) * k.
 * @author Georg Fischer
 */
public class A333194 extends AbstractSequence {

  private int mN = 0;
  private final A000217 mSeq1 = new A000217();
  private final A078471 mSeq2 = new A078471();

  /** Construct the sequence. */
  public A333194() {
    super(1);
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    // a(n) = A000217(n) - A078471(n-1).
    ++mN;
    return (mN == 1) ? Z.ONE : mSeq1.next().subtract(mSeq2.next());
  }
}
