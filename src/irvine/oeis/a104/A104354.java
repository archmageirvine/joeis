package irvine.oeis.a104;
// manually knest/eulphi at 2023-03-12

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A104354 Euler's totient of A104350(n).
 * @author Georg Fischer
 */
public class A104354 extends Sequence1 {

  private final A104350 mSeq = new A104350();

  @Override
  public Z next() {
    return Euler.phi(mSeq.next());
  }
}
