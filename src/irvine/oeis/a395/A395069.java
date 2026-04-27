package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002326;

/**
 * A395069 Number of steps to return a deck of n cards to its original state (original order and all cards face up) under a cyclic signed prefix-reversal shuffle: repeatedly flip the top 1 card, then the top 2, ..., then all n cards, cycling back to 1 until the initial state is restored.
 * @author Sean A. Irvine
 */
public class A395069 extends Sequence1 {

  private final Sequence mA = new A002326().skip();
  private long mN = 0;

  @Override
  public Z next() {
    return mA.next().multiply(++mN);
  }
}
