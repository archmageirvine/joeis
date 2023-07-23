package irvine.oeis.a107;
// manually knest/eulphi at 2023-03-01 16:41

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000073;

/**
 * A107647 Euler's totient function applied to tribonacci numbers.
 * @author Georg Fischer
 */
public class A107647 extends AbstractSequence {

  private final A000073 mSeq1 = new A000073();

  /** Construct the sequence. */
  public A107647() {
    super(2);
  }

  {
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return Euler.phi(mSeq1.next());
  }
}
