package irvine.oeis.a339;
// Generated by gen_seq4.pl simple/simbinom at 2023-03-20 18:29

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A339001 a(n) = (-1)^n * Sum_{k=0..n} (-n)^k * binomial(n,k) * Catalan(k).
 * @author Georg Fischer
 */
public class A339001 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A339001() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.NEG_ONE.pow(mN).multiply(Integers.SINGLETON.sum(0, mN, k -> Z.valueOf(-mN).pow(k).multiply(Binomial.binomial(mN, k)).multiply(Functions.CATALAN.z(k))));
  }
}
