package irvine.oeis.a152;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;


/**
 * A152669 Last digit of Catalan number A000108(n).
 * @author Georg Fischer
 */
public class A152669 extends A000108 {

  /** Construct the sequence. */
  public A152669() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.TEN);
  }
}
