package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030691 Cube root of A030690.
 * @author Sean A. Irvine
 */
public class A030691 extends A030690 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}

