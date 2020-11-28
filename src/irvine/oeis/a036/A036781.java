package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a003.A003422;

/**
 * A036781 a(n) = n + Sum_{k=0..n} k!.
 * @author Sean A. Irvine
 */
public class A036781 extends A003422 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}
