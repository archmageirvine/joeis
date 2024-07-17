package irvine.oeis.a114;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a023.A023531;
import irvine.oeis.a051.A051731;

/**
 * A114002 Expansion of g.f. x^k(1+x^(k+1))/(1-x^(k+1)).
 * @author Georg Fischer
 */
public class A114002 extends AbstractSequence {

  private final A051731 mSeq1 = new A051731();
  private final A023531 mSeq2 = new A023531();

  /** Construct the sequence. */
  public A114002() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply2().subtract(mSeq2.next());
  }
}
