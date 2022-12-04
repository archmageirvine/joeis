package irvine.oeis.a129;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.Sequence0;

/**
 * A129996 a(n) = (-1)^[(n+1)/2] A000108([n/2]+1).
 * @author Georg Fischer
 */
public class A129996 extends Sequence0 {

  private final DifferenceSequence mSeq = new DifferenceSequence(new A129110());

  @Override
  public Z next() {
    return mSeq.next();
  }
}
