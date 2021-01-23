package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009779;

/**
 * A024330 Expansion of tanh(log(1+x))*log(1+x)/2.
 * @author Sean A. Irvine
 */
public class A024330 extends A009779 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

