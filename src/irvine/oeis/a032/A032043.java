package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032043 "BFK" (reversible, size, unlabeled) transform of 2,2,2,2...
 * @author Sean A. Irvine
 */
public class A032043 extends A032005 {

  @Override
  public Z next() {
    return super.next().add(2).divide2();
  }
}
