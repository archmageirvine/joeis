package irvine.oeis.a070;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070906 Every third Bell number A000110.
 * @author Georg Fischer
 */
public class A070906 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return BellNumbers.bell(3 * mN);
  }
}
