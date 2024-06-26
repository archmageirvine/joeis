package irvine.oeis.a002;


import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A002322 Reduced totient function psi(n): least k such that x^k == 1 (mod n) for all x prime to n; also known as the Carmichael lambda function (exponent of unit group mod n); also called the universal exponent of n.
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
  public Z a(final int n) {
    return Functions.CARMICHAEL_LAMBDA.z(n);
  }

  @Override
  public Z a(final Z n) {
    return Functions.CARMICHAEL_LAMBDA.z(n);
  }

  @Override
  public Z next() {
    return Functions.CARMICHAEL_LAMBDA.z(++mN);
  }
}
