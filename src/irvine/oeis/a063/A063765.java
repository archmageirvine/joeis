package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a014.A014210;

/**
 * A063765 Least integer m whose largest prime factor &gt; m^(n/(n+1)).
 * @author Sean A. Irvine
 */
public class A063765 extends A014210 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
