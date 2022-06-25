package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a036.A036917;

/**
 * A057718 A036917/8 (omitting leading term of A036917).
 * @author Sean A. Irvine
 */
public class A057718 extends A036917 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(8);
  }
}
