package irvine.oeis.a299;
// manually knest at 2023-03-13

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000178;

/**
 * A299700 Squarefree part of 1!*2!*3!*...*n!: The product of factorials one through n divided by its largest square divisor.
 * @author Georg Fischer
 */
public class A299700 extends Sequence1 {

  private final A000178 mSeq = new A000178();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).core();
  }
}
