package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001694;

/**
 * A076446 Differences of consecutive powerful numbers (definition 1).
 * @author Georg Fischer
 */
public class A076446 extends Sequence1 {

  private final DifferenceSequence mSeq = new DifferenceSequence(new A001694());

  @Override
  public Z next() {
    return mSeq.next();
  }
}
