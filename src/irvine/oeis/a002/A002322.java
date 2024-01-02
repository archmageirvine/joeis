package irvine.oeis.a002;

import irvine.math.z.Carmichael;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A002322 Reduced totient function psi(n): least k such that x^k == 1 (mod n) for all x prime to n;
 * also known as the Carmichael lambda function (exponent of unit group mod n); also called the universal exponent of n.
 * @author Sean A. Irvine
 */
public class A002322 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002322(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002322() {
    super(1);
  }

  protected long mN = 0;

  @Override
  public Z a(int n) {
    return Carmichael.lambda(n);
  }

  @Override
  public Z a(Z n) {
    return Carmichael.lambda(n.intValueExact());
  }

  @Override
  public Z next() {
    return Carmichael.lambda(++mN);
  }
}
