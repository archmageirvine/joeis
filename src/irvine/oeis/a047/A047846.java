package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a014.A014076;

/**
 * A047846 Number of successive odd nonprimes (A014076).
 * @author Sean A. Irvine
 */
public class A047846 extends A014076 {

  private Z mA = super.next();

  @Override
  public Z next() {
    long count = 0;
    Z t;
    do {
      ++count;
      t = mA;
      mA = super.next();
    } while (mA.equals(t.add(2)));
    return Z.valueOf(count);
  }
}
