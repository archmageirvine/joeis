package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014201.
 * @author Sean A. Irvine
 */
public class A014201 extends A014202 {

  @Override
  public Z next() {
    return super.next().multiply(6);
  }
}
