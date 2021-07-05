package irvine.oeis.a041;
// manually 2021-05-07

import irvine.math.z.Z;
import irvine.oeis.EulerTransform;

/**
 * A041004 The sequence b, given that c is a left shift by one place of b.
 * @author Georg Fischer
 */
public class A041004 extends EulerTransform {

  protected Z mPrev;
  private boolean mFirst = true;
  
  /** Construct the sequence. */
  public A041004() {
    super();
    mPrev = Z.ONE;
  }

  /*
   * After (PARI):
   * <code>EulerT(v)={Vec(exp(x*Ser(dirmul(v, vector(#v, n, 1/n))))-1, -#v)}</code><br />
   * <code>seq(n)={my(v=vector(n+1)); v[1]=1; for(n=2, #v, v[n]=(v[n-1] + EulerT(v[2..n])[n-1])%2); v} \\ Andrew Howroyd, Apr 14 2021</code>
   */
  @Override
  public Z next() {
    Z result = Z.ONE;
    if (mFirst) {
      mFirst = false;
    } else {
      final Z et = super.next();
      result = mPrev.add(et).and(Z.ONE); // (v[n-1] + EULER(v[2..n])[n-1])% 2
      mPrev = result;
    } 
    return result;
  }

  /**
   * Wrapper around <code>mSeq.next()</code>, may be overwritten 
   * when <code>seqType == 1</code>.
   * When this method is overwritten, super.mN runs through 1, 2, 3, and so on.
   * @return next term of the underlying sequence to be Euler transformed
   */
  @Override
  protected Z advance() {
    mAs.set(mN - 1, mN == 1 ? Z.ZERO : mPrev);
    final int i = mN - 1;
    Z cSum = Z.ZERO; // start sum
    for (int d = 1; d <= i; ++d) { // compute c[n] = sum ...
      if (i % d == 0) { // "did(i,d)"
        cSum = cSum.add(Z.valueOf(d).multiply(mAs.get(d)));
      }
    } // for d
    mCs.set(i, cSum); // = c[n]

    if (i > 0) {
      Z bSum = mCs.get(i);
      for (int d = 1; d < i; ++d) {
        bSum = bSum.add(mCs.get(d).multiply(mBs.get(i - d)));
      } // for d
      bSum = bSum.divide(Z.valueOf(i));
      mBs.set(i, bSum);
    }
    return Z.ZERO;
  }
}
