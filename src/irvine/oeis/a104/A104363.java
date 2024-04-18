package irvine.oeis.a104;
// manually knest/eulphi at 2023-03-01 16:41

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A104363 Euler's totient of A104357(n) = A104350(n) - 1.
 * @author Georg Fischer
 */
public class A104363 extends Sequence2 {

  private final A104357 mSeq = new A104357();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.PHI.z(mSeq.next());
  }
}
