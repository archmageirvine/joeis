package irvine.oeis.a082;
// manually cordrec at 2022-06-09 19:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A082472 a(1) = 1, a(n) = Sum_{k=1..n-1} a(k)*2^k.
 * <code>a(n+1) = (2^n+1)*a(n)</code>
 * @author Georg Fischer
 */
public class A082472 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A082472() {
    super(1, 1, 1, 1, 2);
  }

  @Override
  protected Z compute(final int n) {
    return Z.ONE.shiftLeft(n).add(1).multiply(a(n));
  }
}
