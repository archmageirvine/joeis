package irvine.oeis.a330;
// Generated by gen_seq4.pl floor at 2021-08-24 07:13

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A330182 a(n) = n + floor(nr/t) + floor(ns/t), where r = Pi - 1, s = Pi, t = Pi + 1.
 * @author Georg Fischer
 */
public class A330182 extends FloorSequence {

  private final CR mR = CR.PI.subtract(CR.ONE);
  private final CR mS = CR.PI;
  private final CR mT = CR.PI.add(CR.ONE);

  /** Construct the sequence. */
  public A330182() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.valueOf(n).multiply(mR).divide(mT).floor()).add(CR.valueOf(n).multiply(mS).divide(mT).floor());
  }

}
