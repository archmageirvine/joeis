package irvine.oeis.a071;
// Generated by gen_seq4.pl 2024-07-12/lambdan at 2024-07-12 23:14

import irvine.math.cr.CR;
import irvine.oeis.LambdaSequence;

/**
 * A071401 Rounded volume of a regular dodecahedron with edge length n.
 * @author Georg Fischer
 */
public class A071401 extends LambdaSequence {

  /** Construct the sequence. */
  public A071401() {
    super(0, n -> CR.valueOf(n).pow(3).multiply(CR.FIVE.sqrt().multiply(7).add(15).divide(4)).round());
  }
}
