package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a002.A002386;

/**
 * A008950 Increasing length runs of consecutive composite numbers (starting points).
 * @author Sean A. Irvine
 */
public class A008950 extends A002386 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
