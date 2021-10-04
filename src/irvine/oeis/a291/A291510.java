package irvine.oeis.a291;
// manually parmof3 at 2021-10-04 15:43

import irvine.math.z.Z;

/**
 * A291510 The arithmetic function uhat(n,2,5), negated.
 * @author Georg Fischer
 */
public class A291510 extends A291041 {

  /** Construct the sequence. */
  public A291510() {
    super(1, 2, 5);
  }

  @Override
  public Z next() {
    return super.next().negate();
  }
}
