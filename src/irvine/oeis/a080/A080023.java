package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000032;

/**
 * A080023 log_phi(n) is closer to an integer than is log_phi(m) for any m with 2&lt;=m&lt;n, where phi=(1+sqrt(5))/2 is the golden ratio.
 * @author Georg Fischer
 */
public class A080023 extends AbstractSequence {

  private final A000032 mSeq = new A000032();
  private Z mA;

  /** Construct the sequence. */
  public A080023() {
    super(1);
    mSeq.next();
    mSeq.next();
    mA = Z.TWO;
  }

  @Override
  public Z next() {
    final Z result = mA;
    mA = mSeq.next();
    return result;
  }
}
