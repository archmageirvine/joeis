package irvine.oeis.a275;
// manually knestm/knest at 2023-03-02 19:24

import irvine.math.z.Z;
import irvine.oeis.a005.A005942;

/**
 * A275202 Subword complexity (number of distinct blocks of length n) of the period doubling sequence A096268.
 * @author Georg Fischer
 */
public class A275202 extends A005942 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
