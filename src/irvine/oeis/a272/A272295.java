package irvine.oeis.a272;
// manually 2025-06-06

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.MultiplicativeSequence;

/**
 * A272295 Let 2*n+1 have prime factorization Prod_i p_i^k_i; then a(n) = Prod_i v_i^k_i, where v_i = (1+p_i)/2 if p_i == 1 (mod 4), v_i = (1-p_i)/2 if p_i == 3(mod 4).
 * @author Georg Fischer
 */
public class A272295 extends AbstractSequence {

  private int mN;
  private MultiplicativeSequence mSeq; // sequence v

  /** Construct the sequence. */
  public A272295() {
    super(0);
    mSeq = new MultiplicativeSequence(0, (p, e) -> p.equals(Z.TWO) ? Z.ZERO : (p.mod(4) == 1 ? Z.ONE.add(p).divide2() : Z.ONE.subtract(p).divide2()).pow(e));
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      ++mN;
      mSeq.next();
    }
    return mSeq.next();
  }
}
