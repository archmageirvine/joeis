package irvine.oeis.a244;
// manually knest/jaguarz at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a001.A001221;

/**
 * A244063 Number of prime factors (with multiplicity) of the number of distinct prime factors of n; a(n) = Omega(omega(n)).
 * @author Georg Fischer
 */
public class A244063 extends Sequence2 {

  private final A001221 mSeq = new A001221();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(mSeq.next());
  }
}
