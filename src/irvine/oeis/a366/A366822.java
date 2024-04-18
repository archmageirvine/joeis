package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014566;

/**
 * A366822 a(n) is phi(n^n + 1) where phi is the Euler totient function.
 * @author Sean A. Irvine
 */
public class A366822 extends Sequence0 {

  private final Sequence mSeq = new A014566();

  @Override
  public Z next() {
    return Functions.PHI.z(mSeq.next());
  }
}
