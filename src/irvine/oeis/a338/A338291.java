package irvine.oeis.a338;
// Generated by gen_seq4.pl 2023-10-07/trinv at 2023-10-08 10:07

import irvine.oeis.a077.A077028;
import irvine.oeis.triangle.Inverse;

/**
 * A338291 Matrix inverse of the rascal triangle (A077028), read across rows..
 * @author Georg Fischer
 */
public class A338291 extends Inverse {

  /** Construct the sequence. */
  public A338291() {
    super(0, new A077028());
  }
}
