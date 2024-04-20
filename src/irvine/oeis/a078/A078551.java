package irvine.oeis.a078;
// manually knest/jaguar at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a001.A001157;

/**
 * A078551 Largest prime dividing sigma(2,n).
 * @author Georg Fischer
 */
public class A078551 extends Sequence2 {

  private final A001157 mSeq = new A001157();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.GPF.z(mSeq.next());
  }
}
