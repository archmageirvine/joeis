package irvine.oeis.a021;

import irvine.math.z.Z;

/**
 * A021007.
 * @author Sean A. Irvine
 */
public class A021007 extends A021005 {

  @Override
  public Z next() {
    return super.next().add(2);
  }
}

