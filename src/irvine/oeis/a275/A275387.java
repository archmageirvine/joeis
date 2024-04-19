package irvine.oeis.a275;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a063.A063647;
import irvine.oeis.a066.A066446;

/**
 * A275387 Numbers of ordered pairs of divisors d &lt; e of n such that gcd(d, e) &gt; 1.
 * @author Georg Fischer
 */
public class A275387 extends AbstractSequence {

  private final A066446 mSeq1 = new A066446();
  private final A063647 mSeq2 = new A063647();

  /** Construct the sequence. */
  public A275387() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
