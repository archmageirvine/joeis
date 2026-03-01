package irvine.oeis.a326;
// manually 2025-09-27

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A326129 a(n) = gcd(A326127(n), A326128(n)).
 * @author Georg Fischer
 */
public class A326129 extends AbstractSequence implements DirectSequence {

  private int mN;
  private static final DirectSequence A326127 = new A326127();
  private static final DirectSequence A326128 = new A326128();

  /** Construct the sequence. */
  public A326129() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final Z n) {
    return Functions.GCD.z(A326127.a(n), A326128.a(n));
  }

  @Override
  public Z a(final int n) {
    return Functions.GCD.z(A326127.a(n), A326128.a(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
