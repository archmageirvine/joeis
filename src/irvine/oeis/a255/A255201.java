package irvine.oeis.a255;
// manually knest/jaguarz at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A255201 Number of prime factors of n^2.
 * @author Georg Fischer
 */
public class A255201 extends Sequence1 {

  private final A000290 mSeq = new A000290();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(mSeq.next());
  }
}
