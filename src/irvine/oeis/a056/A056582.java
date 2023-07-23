package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000312;
import irvine.oeis.a002.A002109;

/**
 * A056582 Highest common factor (or GCD) of n^n and hyperfactorial(n-1), i.e., gcd(n^n, product(k^k) for k &lt; n).
 * @author Sean A. Irvine
 */
public class A056582 extends AbstractSequence {

  private final A000312 mSeq1 = new A000312();

  /** Construct the sequence. */
  public A056582() {
    super(2);
  }

  private final Sequence mA = new A002109();

  {
    mSeq1.next();
    mSeq1.next();
    mA.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().gcd(mA.next());
  }
}
