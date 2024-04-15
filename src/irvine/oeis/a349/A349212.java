package irvine.oeis.a349;
// manually sigman0/sigma0s at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001787;

/**
 * A349212 a(n) = Sum_{d|n} n^(d mod 2).
 * @author Georg Fischer
 */
public class A349212 extends Sequence1 {

  private final A001787 mSeq = new A001787();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(mSeq.next());
  }
}
