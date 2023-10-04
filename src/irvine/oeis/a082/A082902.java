package irvine.oeis.a082;
// manually knowna4/simtraf at 2023-10-03 22:13

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a001.A001157;

/**
 * A082902 a(n) = gcd(2^n, sigma(2,n)) = gcd(A000079(n), A001157(n)).
 * @author Georg Fischer
 */
public class A082902 extends AbstractSequence {

  private final AbstractSequence mSeq1 = new A000079().skip(1);
  private final AbstractSequence mSeq2 = new A001157();

  /** Construct the sequence. */
  public A082902() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().gcd(mSeq2.next());
  }
}
