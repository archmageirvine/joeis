package irvine.oeis.a330;
// Generated by gen_seq4.pl floor at 2021-08-24 07:13

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A330177 a(n) = n + floor(ns/r) + floor(nt/r), where r = e - 2, s = e - 1, t = e.
 * @author Georg Fischer
 */
public class A330177 extends FloorSequence {

  private final CR mR = CR.E.subtract(CR.TWO);
  private final CR mS = CR.E.subtract(CR.ONE);
  private final CR mT = CR.E;

  /** Construct the sequence. */
  public A330177() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.valueOf(n).multiply(mS).divide(mR).floor()).add(CR.valueOf(n).multiply(mT).divide(mR).floor());
  }

}
