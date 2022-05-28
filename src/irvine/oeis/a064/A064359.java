package irvine.oeis.a064;
// manually inverse at 2022-05-26 20:28

import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.a052.A052331;

/**
 * A064359 Inverse of sequence A052331 considered as a permutation of the natural numbers.
 * @author Georg Fischer
 */
public class A064359 extends InverseSequence {

  /** Construct the sequence. */
  public A064359() {
    super(new A052331(), 1, 1);
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

