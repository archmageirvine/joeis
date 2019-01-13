package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014198.
 * @author Sean A. Irvine
 */
public class A014198 extends A014200 {

  @Override
  public Z next() {
    return super.next().shiftLeft(2);
  }
}
