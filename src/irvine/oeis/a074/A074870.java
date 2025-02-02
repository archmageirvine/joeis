package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a075.A075277;

/**
 * A074870 Smallest interprimes of the form n*prime.
 * @author Sean A. Irvine
 */
public class A074870 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    return new A075277(1, ++mN).next();
  }
}
