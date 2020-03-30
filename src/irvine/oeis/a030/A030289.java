package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030289.
 * @author Sean A. Irvine
 */
public class A030289 extends A030290 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
