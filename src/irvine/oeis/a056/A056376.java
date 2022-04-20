package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056376 Number of step shifted (decimated) sequences using exactly two different symbols.
 * @author Sean A. Irvine
 */
public class A056376 extends A056371 {

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
