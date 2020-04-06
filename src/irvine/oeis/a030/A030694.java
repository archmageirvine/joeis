package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030694 Square root of <code>A030693</code>.
 * @author Sean A. Irvine
 */
public class A030694 extends A030693 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}

