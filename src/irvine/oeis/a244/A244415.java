package irvine.oeis.a244;
// manually valuation/valuat at 2022-03-16 18:05

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005843;

/**
 * A244415 Exponent of 4 appearing in the 4-adic value of 1/n, n &gt;= 1, given in A240226(n).
 * @author Georg Fischer
 */
public class A244415 extends A005843 {

  /** Construct the sequence. */
  public A244415() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.next(), Z.FOUR);
  }
}
