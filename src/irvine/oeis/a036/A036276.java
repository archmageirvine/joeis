package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a001.A001864;

/**
 * A036276 a(n) = A001864(n+1)/2.
 * @author Sean A. Irvine
 */
public class A036276 extends A001864 {

  /** Construct the sequence. */
  public A036276() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

