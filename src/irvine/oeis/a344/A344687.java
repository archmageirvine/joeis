package irvine.oeis.a344;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a027.A027423;

/**
 * A344687 a(n) is the lowest nonnegative exponent k such that n!^k is the product of the divisors of n!.
 * <code>a(n) = A027423(n)/2 for n &gt; 1</code>
 * @author Georg Fischer
 */
public class A344687 extends Sequence1 {

  private final A027423 mSeq = new A027423();

  /** Construct the sequence. */
  public A344687() {
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().divide2();
  }
}
