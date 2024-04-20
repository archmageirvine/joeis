package irvine.oeis.a104;
// manually knest/jaguar at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A104359 Greatest prime factor of A104357(n) = A104350(n) - 1.
 * @author Georg Fischer
 */
public class A104359 extends Sequence2 {

  private final A104357 mSeq = new A104357();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.GPF.z(mSeq.next());
  }
}
