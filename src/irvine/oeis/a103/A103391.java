package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.a003.A003602;

/**
 * A103391 "Even" fractal sequence for the natural numbers: Deleting every even-indexed term results in the same sequence.
 * @author Georg Fischer
 */
public class A103391 extends A003602 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return mN <= 1 ? Z.ONE : super.next().add(1);
  }
}
