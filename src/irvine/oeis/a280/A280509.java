package irvine.oeis.a280;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a057.A057889;

/**
 * A280509 a(n) = A051064(A246200(n)); 3-adic valuation of A057889(3*n).
 * @author Georg Fischer
 */
public class A280509 extends A057889 {

  /** Construct the sequence. */
  public A280509() {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    super.next();
    return Functions.VALUATION.z(super.next(), Z.THREE);
  }
}
