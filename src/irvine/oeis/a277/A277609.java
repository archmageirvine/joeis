package irvine.oeis.a277;
// manually hygeom at 2022-08-05 09:24

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A277609 Fourth column of Euler's difference table in A068106. It is 6 times the sequence A000261.
 * @author Georg Fischer
 */
public class A277609 extends HypergeometricSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A277609() {
    super(3, 1, 1, "[[3,-1],[0,-1],[-1]]");
  }

  @Override
  public Z next() {
    ++mN;
    return mN <= 2 ? Z.ZERO : super.nextQ().multiply(MemoryFactorial.SINGLETON.factorial(mN)).num();
  }
}
