package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a024.A024620;

/**
 * A027883.
 * @author Sean A. Irvine
 */
public class A027883 extends A024620 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
