package irvine.oeis.a294;
// manually partsum at 2023-05-28 21:45

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a060.A060828;

/**
 * A294493 a(n) = Sum_{m=0..n} 3^v3(m!), where v3(m!) is the exponent of the highest power of 3 dividing n!, expressed in base 3.
 * @author Georg Fischer
 */
public class A294493 extends PartialSumSequence {

  /** Construct the sequence. */
  public A294493() {
    super(0, new A060828());
  }

  public Z next() {
    return new Z(super.next().toString(3));
  }
}
