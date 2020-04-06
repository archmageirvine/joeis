package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030679 Cube root of <code>A030678</code>.
 * @author Sean A. Irvine
 */
public class A030679 extends A030678 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}

