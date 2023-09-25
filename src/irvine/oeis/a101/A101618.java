package irvine.oeis.a101;
// manually filtpos at 2023-09-24 22:35

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001003;

/**
 * A101618 Indices of semiprimes in A001003.
 * @author Georg Fischer
 */
public class A101618 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A101618() {
    super(1, 1, new A001003(), SEMIPRIME);
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
