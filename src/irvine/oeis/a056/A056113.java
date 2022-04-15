package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A056113 Most significant digit of n-th primorial A002110.
 * @author Sean A. Irvine
 */
public class A056113 extends A002110 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().charAt(0) - '0');
  }
}
