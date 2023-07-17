package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a008.A008300;

/**
 * A075754 Number of n X n (0,1) matrices containing exactly five 1's in each row and in each column.
 * @author Sean A. Irvine
 */
public class A075754 extends A008300 {

  /** Construct the sequence. */
  public A075754() {
    super(5);
  }

  private int mN = 4;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}
