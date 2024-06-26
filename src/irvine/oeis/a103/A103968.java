package irvine.oeis.a103;
// Generated by gen_seq4.pl sigman1/sigma1s at 2023-02-28 23:52

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a023.A023001;

/**
 * A103968 Sigma((8^n - 1)/7), where sigma(n) is the sum of positive divisors of n.
 * @author Georg Fischer
 */
public class A103968 extends AbstractSequence {

  private final A023001 mSeq1 = new A023001();

  /** Construct the sequence. */
  public A103968() {
    super(1);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA1.z(mSeq1.next());
  }
}
