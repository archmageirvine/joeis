package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030698 Cube root of A030697.
 * @author Sean A. Irvine
 */
public class A030698 extends A030697 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}

