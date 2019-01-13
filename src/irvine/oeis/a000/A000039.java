package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000039.
 * @author Sean A. Irvine
 */
public class A000039 extends A000025 {

  @Override
  public Z next() {
    final Z r = super.next();
    super.next();
    return r;
  }
}

