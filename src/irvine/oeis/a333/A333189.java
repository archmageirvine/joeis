package irvine.oeis.a333;
// manually floorr at 2021-09-01 13:58

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A333189 a(n) = [2^n csc(1/n)] - [2^n cot(1/n)] - [2^n (csc(1/n) - cot(1/n))], where [ ] = floor.
 * @author Georg Fischer
 */
public class A333189 extends FloorSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  /** Construct the sequence. */
  public A333189() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    final CR n2 = CR.valueOf(Z.ONE.shiftLeft(n));
    final CR n1 = CR.valueOf(n).inverse();
    final CR nCsc = n1.sin().inverse();
    final CR nCot = REALS.cot(n1);
    return n2.multiply(nCsc).floor()
        .subtract(n2.multiply(nCot).floor())
        .subtract(n2.multiply(nCsc.subtract(nCot)).floor());
  }

}
