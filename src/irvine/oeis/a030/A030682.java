package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030682 Square root of A030681.
 * @author Sean A. Irvine
 */
public class A030682 extends A030681 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}

