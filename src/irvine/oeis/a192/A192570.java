package irvine.oeis.a192;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A192570 a(n) = floor(sqrt(Bell(n))).
 * @author Georg Fischer
 */
public class A192570 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return BellNumbers.bell(mN).sqrt();
  }
}
