package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036919 A036918/2.
 * @author Sean A. Irvine
 */
public class A036919 extends A036918 {

  /** Construct the sequence. */
  public A036919() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
