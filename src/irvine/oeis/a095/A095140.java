package irvine.oeis.a095;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;


/**
 * A095140 Triangle, read by rows, formed by reading Pascal's triangle (A007318) mod 5.
 * @author Georg Fischer
 */
public class A095140 extends A007318 {

  /** Construct the sequence. */
  public A095140() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.FIVE);
  }
}
