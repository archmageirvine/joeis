package irvine.oeis.a395;

import irvine.math.z.Frobenius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a020.A020882;
import irvine.oeis.a046.A046086;
import irvine.oeis.a046.A046087;

/**
 * A395177 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A395177 extends Sequence1 {

  private final Sequence mX = new A046086();
  private final Sequence mY = new A046087();
  private final Sequence mZ = new A020882();

  @Override
  public Z next() {
    return Frobenius.frobenius(mX.next(), mY.next(), mZ.next());
  }
}
