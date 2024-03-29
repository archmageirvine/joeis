package irvine.oeis.a206;
// Generated by gen_seq4.pl floor at 2021-08-24 07:13

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A206905 n+[nr/t]+[ns/t], where []=floor, r=3, s=sqrt(3), t=1/s.
 * @author Georg Fischer
 */
public class A206905 extends FloorSequence {

  private final CR mR = CR.THREE;
  private final CR mS = CR.THREE.sqrt();
  private final CR mT = CR.ONE.divide(mS);

  /** Construct the sequence. */
  public A206905() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.valueOf(n).multiply(mR).divide(mT).floor()).add(CR.valueOf(n).multiply(mS).divide(mT).floor());
  }

}
