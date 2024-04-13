package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A004089 Reverse digits of number of partitions of n.
 * @author Sean A. Irvine
 */
public class A004089 extends A000041 {

  @Override
  public Z next() {
    return Functions.REVERSE.z(super.next());
  }
}

