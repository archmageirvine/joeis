package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030694 Square root of A030693.
 * @author Sean A. Irvine
 */
public class A030694 extends A030693 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}

