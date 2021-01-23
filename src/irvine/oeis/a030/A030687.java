package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030687 Square root of A030686.
 * @author Sean A. Irvine
 */
public class A030687 extends A030686 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}

