package irvine.oeis.a272;
// manually 2025-06-06

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.MultiplicativeSequence;

/**
 * A272295 a(n) = v(2*n+1), where v is a completely multiplicative sequence defined by v(2)=0 and for prime p &gt;= 3: v(p^e) = ((p+1)/2))^e when p == 1 mod 4, and v(p^e) = ((1-p)/2)^e when p == 3 mod 4.
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
