package irvine.oeis.a190;
// Generated by gen_seq4.pl floor at 2021-08-24 07:13

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A190747 n+[nr/t]+[ns/t]+[nu/t]+[nv/t]+[nw/t], where r=sinh(1), s=cosh(1), t=tanh(1), u=csch(1), v=sech(1), w=coth(1).
 * @author Georg Fischer
 */
public class A190747 extends FloorSequence {

  private final CR mR = CR.ONE.sinh();
  private final CR mS = CR.ONE.cosh();
  private final CR mT = CR.ONE.tanh();
  private final CR mU = CR.ONE.divide(CR.ONE.sinh());
  private final CR mV = CR.ONE.divide(CR.ONE.cosh());
  private final CR mW = CR.ONE.coth();

  /** Construct the sequence. */
  public A190747() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.valueOf(n).multiply(mR).divide(mT).floor()).add(CR.valueOf(n).multiply(mS).divide(mT).floor()).add(CR.valueOf(n).multiply(mU).divide(mT).floor()).add(CR.valueOf(n).multiply(mV).divide(mT).floor()).add(CR.valueOf(n).multiply(mW).divide(mT).floor());
  }

}
