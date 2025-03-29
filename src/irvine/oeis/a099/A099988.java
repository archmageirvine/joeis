package irvine.oeis.a099;
// manually 2025-03-28

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000959;

/**
 * A099988 Bisection of lucky numbers, A000959.
 * @author Georg Fischer
 */
public class A099988 extends Sequence1 {

  private final A000959 mSeq = new A000959();

  @Override
  public Z next() {
    final Z result = mSeq.next();
    mSeq.next();
    return result;
  }
}

