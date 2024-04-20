package irvine.oeis.a120;
// manually knest/jaguar at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a001.A001819;

/**
 * A120298 Largest prime factor of the n-th central factorial number A001819(n).
 * @author Georg Fischer
 */
public class A120298 extends Sequence2 {

  private final A001819 mSeq = new A001819();

  {
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.GPF.z(mSeq.next());
  }
}
