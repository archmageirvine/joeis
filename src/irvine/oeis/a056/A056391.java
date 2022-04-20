package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056391 Number of step shifted (decimated) sequence structures using a maximum of two different symbols.
 * @author Sean A. Irvine
 */
public class A056391 extends A056371 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
