package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039732 a(n) = s(n+1)/2, s=A039731.
 * @author Sean A. Irvine
 */
public class A039732 extends A039731 {

  /** Construct the sequence. */
  public A039732() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
