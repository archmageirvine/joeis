package irvine.oeis.a104;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A104358 Smallest prime factor of A104357(n) = A104350(n) - 1.
 * @author Georg Fischer
 */
public class A104358 extends Sequence2 {

  private final A104357 mSeq = new A104357();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.LPF.z(mSeq.next());
  }
}
