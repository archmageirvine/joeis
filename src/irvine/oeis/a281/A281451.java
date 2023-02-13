package irvine.oeis.a281;
// manually etman at 2023-02-06 12:43

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a122.A122865;

/**
 * A281451 Expansion of x * f(x, x) * f(x, x^17) in powers of x where f(, ) is Ramanujan's general theta function.
 * <code>a(n) = A122865(3*n + 2).</code>
 * @author Georg Fischer
 */
public class A281451 extends Sequence1 {

  private final A122865 mSeq = new A122865();

  /** Construct the sequence. */
  public A281451() {
    mSeq.next();
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    mSeq.next();
    mSeq.next();
    return mSeq.next();
  }
}
