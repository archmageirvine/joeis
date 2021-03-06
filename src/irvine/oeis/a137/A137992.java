package irvine.oeis.a137;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a014.A014137;


/**
 * A137992 A014137 (= partial sums of Catalan numbers A000108) mod 3.
 * @author Georg Fischer
 */
public class A137992 extends A014137 {

  /** Construct the sequence. */
  public A137992() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}
