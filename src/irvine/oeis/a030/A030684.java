package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030684 Cube root of A030683.
 * @author Sean A. Irvine
 */
public class A030684 extends A030683 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}

