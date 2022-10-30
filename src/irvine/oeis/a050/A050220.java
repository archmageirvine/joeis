package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050220 Larger of Smith brothers.
 * @author Sean A. Irvine
 */
public class A050220 extends A050219 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
