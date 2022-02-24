package irvine.oeis.a153;
// manually insect/insect2 at 2022-02-24 18:18

import irvine.math.z.Z;
import irvine.oeis.IntersectionSequence;
import irvine.oeis.a028.A028873;
import irvine.oeis.a049.A049422;

/**
 * A153262 Squares such that square+-3=primes.
 * @author Georg Fischer
 */
public class A153262 extends IntersectionSequence {

  /** Construct the sequence. */
  public A153262() {
    super(new A028873(), new A049422());
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
