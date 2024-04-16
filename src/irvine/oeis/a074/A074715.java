package irvine.oeis.a074;
// manually knest/jaguarz at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a058.A058635;

/**
 * A074715 Number of prime factors of F(2^n) where F(m) is the m-th Fibonacci number.
 * @author Georg Fischer
 */
public class A074715 extends Sequence1 {

  private final A058635 mSeq = new A058635();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(mSeq.next()));
  }
}
