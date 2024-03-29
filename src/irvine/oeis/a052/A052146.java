package irvine.oeis.a052;
// Generated by gen_seq4.pl floor at 2021-08-28 23:11

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A052146 a(n) = floor((sqrt(1+8*n)-3)/2).
 * @author Georg Fischer
 */
public class A052146 extends FloorSequence {
  /** Construct the sequence. */
  public A052146() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.HALF.multiply(CR.ONE.add(CR.EIGHT.multiply(CR.valueOf(n))).sqrt()).add(CR.HALF).floor().subtract(Z.TWO);
  }

}
