package irvine.oeis.a291;
// manually parmof3 at 2021-10-04 15:43

import irvine.math.z.Z;

/**
 * A291516 The arithmetic function uhat(n,3,7), negated.
 * @author Georg Fischer
 */
public class A291516 extends A291041 {

  /** Construct the sequence. */
  public A291516() {
    super(1, 3, 7);
  }

  @Override
  public Z next() {
    return super.next().negate();
  }
}
