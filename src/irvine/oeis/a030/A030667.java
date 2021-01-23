package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030667 Square root of A030666(n).
 * @author Sean A. Irvine
 */
public class A030667 extends A030666 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}

