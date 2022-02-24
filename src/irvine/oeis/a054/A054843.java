package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001227;
import irvine.oeis.a010.A010054;

/**
 * A054843 Number of sequences of consecutive nonnegative integers (including sequences of length 1) that sum to n.
 * @author Sean A. Irvine
 */
public class A054843 extends A010054 {

  private final Sequence mA = new PrependSequence(new A001227(), 0);

  @Override
  public Z next() {
    return mA.next().add(super.next());
  }
}
