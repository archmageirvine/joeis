package irvine.oeis.a190;
// Generated by gen_seq4.pl floor at 2021-08-24 07:13

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A190055 a(n) = n + [n*r/t] + [n*s/t];  r=2, s=sin(Pi/3), t=csc(Pi/3).
 * @author Georg Fischer
 */
public class A190055 extends FloorSequence {

  private final CR mR = CR.TWO;
  private final CR mS = CR.HALF.multiply(CR.THREE.sqrt());
  private final CR mT = CR.TWO.divide(CR.THREE).multiply(CR.THREE.sqrt());

  /** Construct the sequence. */
  public A190055() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.valueOf(n).multiply(mR).divide(mT).floor()).add(CR.valueOf(n).multiply(mS).divide(mT).floor());
  }

}
