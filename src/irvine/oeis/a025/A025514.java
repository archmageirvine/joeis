package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025514 Sequence A025513 divided by 2.
 * @author Sean A. Irvine
 */
public class A025514 extends A025513 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
