package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A085021 Number of prime factors of cyclotomic(n,2), which is A019320(n), the value of the n-th cyclotomic polynomial evaluated at x=2.
 * @author Georg Fischer
 */
public class A085021 implements Sequence {

  private int mN;
  private int mCyclo;

  /** Construct the sequence. */
  public A085021() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param cyclo
   */
  public A085021(final int cyclo) {
    mN = 0;
    mCyclo = cyclo;
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(Cyclotomic.cyclotomic(++mN, mCyclo)).bigOmega());
  }
}
