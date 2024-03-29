package irvine.oeis.a080;
// Generated by gen_seq4.pl build/parmof4 at 2022-06-08 20:52

import irvine.math.z.Z;
import irvine.oeis.a079.A079000;

/**
 * A080644 a(1) = 5; for n&gt;1, a(n) is taken to be the smallest integer greater than a(n-1) which is consistent with the condition "n is a member of the sequence if and only if a(n) is divisible by 6".
 * @author Georg Fischer
 */
public class A080644 extends A079000 {

  /** Construct the sequence. */
  public A080644() {
    super(1, 5, 1, n -> n.mod(Z.SIX).isZero());
  }
}
