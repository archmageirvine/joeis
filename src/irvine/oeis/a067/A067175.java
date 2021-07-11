package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A067175 Number of digits in the n-th primorial (A002110).
 * @author Sean A. Irvine
 */
public class A067175 extends A002110 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().length());
  }
}

