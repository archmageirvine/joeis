package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A078606 Constant c(p) used in determining divisibility by the n-th prime, p=A000040(n), for n&gt;=4.
 * @author Sean A. Irvine
 */
public class A078606 extends AbstractSequence {

  private final Sequence mPrimes = new A000040().skip(3);

  /** Construct the sequence. */
  public A078606() {
    super(4);
  }

  @Override
  public Z next() {
    final Z p = mPrimes.next();
    final Z v = Z.TEN.modInverse(p);
    return v.multiply2().compareTo(p) > 0 ? v.subtract(p) : v;
  }
}

