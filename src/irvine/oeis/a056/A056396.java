package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056396 Number of step shifted (decimated) sequence structures using exactly two different symbols.
 * @author Sean A. Irvine
 */
public class A056396 extends A056391 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
