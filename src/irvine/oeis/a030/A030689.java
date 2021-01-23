package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030689 Square root of A030688.
 * @author Sean A. Irvine
 */
public class A030689 extends A030688 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}

