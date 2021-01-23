package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.a018.A018819;

/**
 * A040039 First differences of A033485; also A033485 with terms repeated.
 * @author Sean A. Irvine
 */
public class A040039 extends A018819 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
