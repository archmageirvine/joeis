package irvine.oeis.a002;

import irvine.math.z.Carmichael;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002322 Reduced totient function psi(n): least k such that x^k == 1 (mod n) for all x prime to n; also known as the Carmichael lambda function (exponent of unit group mod n); also called the universal exponent of n.
 * @author Sean A. Irvine
 */
public class A002322 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    return Carmichael.lambda(++mN);
  }
}
