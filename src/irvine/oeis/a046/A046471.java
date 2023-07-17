package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046471 Number of numbers k&gt;1 such that k equals the sum of digits in k^n.
 * @author Sean A. Irvine
 */
public class A046471 extends A046019 {

  /** Construct the sequence. */
  public A046471() {
    super(1);
  }

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
