package irvine.oeis.a184;
// Generated by gen_seq4.pl floor at 2021-08-23 22:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A184484 Lower s-Wythoff sequence, where s(n)=3n-2.  Complement of A184485.
 * @author Georg Fischer
 */
public class A184484 extends FloorSequence {
  /** Construct the sequence. */
  public A184484() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(13).sqrt().subtract(CR.ONE).multiply(CR.valueOf(n).multiply(CR.valueOf(13).sqrt()).add(CR.TWO.multiply(CR.valueOf(n))).add(CR.TWO)).divide(CR.TWO.multiply(CR.valueOf(13).sqrt()).add(CR.FOUR)).floor();
  }

}
