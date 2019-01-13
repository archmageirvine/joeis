package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a003.A003983;

/**
 * A004197.
 * @author Sean A. Irvine
 */
public class A004197 extends A003983 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

