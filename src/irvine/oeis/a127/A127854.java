package irvine.oeis.a127;
// manually A213027/arronk

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a213.A213027;

/**
 * A127854 Largest number k such that k^2 divides A007781(6n+1).
 * @author Georg Fischer
 */
public class A127854 extends Sequence1 {

  private int mN = 1;
  private final A213027 mSeq = new A213027();

  @Override
  public Z next() {
    ++mN;
    return mSeq.matrixElement(3, mN);
  }
}

