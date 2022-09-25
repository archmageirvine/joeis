package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a014.A014417;

/**
 * A035614 Horizontal para-Fibonacci sequence: says which column of Wythoff array (starting column count at 0) contains n+1.
 * @author Sean A. Irvine
 */
public class A035614 extends A014417 {

  {
    super.next();
  }

  @Override
  public Z next() {
    Z t = super.next();
    long c = 0;
    while (t.mod(10) == 0) {
      t = t.divide(10);
      ++c;
    }
    return Z.valueOf(c);
  }
}

