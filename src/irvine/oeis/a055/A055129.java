package irvine.oeis.a055;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A055129 Repunits in different bases: table by antidiagonals of numbers written in base k as a string of n 1's.
 * add(k^j, j=0..n-1)
 * @author Georg Fischer
 */
public class A055129 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A055129() {
    super(1, 1, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Integers.SINGLETON.sum(0, n - 1, j -> Z.valueOf(k).pow(j));
  }
}
