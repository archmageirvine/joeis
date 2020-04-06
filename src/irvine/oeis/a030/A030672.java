package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030672 Square root of <code>A030671</code>.
 * @author Sean A. Irvine
 */
public class A030672 extends A030671 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}

