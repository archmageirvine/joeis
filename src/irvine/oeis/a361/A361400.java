package irvine.oeis.a361;

import irvine.math.z.Z;

/**
 * A361400 a(n) is the product of the number dropped on the upper face of the dice as a result of its rotation through the edge when rolling over the cell with the number n of the square spiral of the natural row, and this number n.
 * @author Sean A. Irvine
 */
public class A361400 extends A361136 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
