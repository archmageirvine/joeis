package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a001.A001995;

/**
 * A004434 Numbers that are the sum of 5 distinct nonzero squares.
 * @author Sean A. Irvine
 */
public class A004434 extends A001995 {

  @Override
  protected Z init() {
    return Z.ONE;
  }
}
