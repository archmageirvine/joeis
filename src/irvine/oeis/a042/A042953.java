package irvine.oeis.a042;
// manually

import irvine.math.z.Z;
import irvine.oeis.EulerTransform;
import irvine.oeis.Sequence;

/**
 * A042953 The sequence e when b=[ 1,0,1,1,1,... ].
 * @author Georg Fischer
 */
public class A042953 extends EulerTransform {

  protected Sequence mSeqB; // to be overwritten by the specific sequence for vector <code>b</code>
  
  /**
   * This sequence represents the vector <code>b</code> in the OEIS definition.
   */
  protected class SeqB53 implements Sequence {
    private int mN;
    public SeqB53() {
      mN = 0;
    }
    
    @Override
    public Z next() {
      return ++mN == 2 ? Z.ZERO : Z.ONE;
    }
  } // mSeqB
  
  /**
   * This sequence represents the binary vector <code>v</code> in the PARI
   * that is finally Euler transformed and prefixed with 1.
   */
  private class BinarySequence extends EulerTransform {
    protected Z mPrev;
    private int mN;
    private BinarySequence() {
      mN = 0;
      mPrev = Z.ONE;
    }
    
    /*
      After A042953 (PARI):
      EulerT(v)={Vec(exp(x*Ser(dirmul(v, vector(#v, n, 1/n))))-1, -#v)}
      seq(n)={my(u=vector(n, i, i<>2), v=vector(n)); for(n=1, #v, v[n]=(u[n] + EulerT(v[1..n])[n])%2);
      concat([1], EulerT(v))} \\ Andrew Howroyd, May 03 2021
     */
    @Override
    public Z next() {
      ++mN;
      final Z et = super.next();
      mPrev = mSeqB.next().add(et).and(Z.ONE);
      return mPrev;
    }
  
    /**
     * Wrapper around <code>mSeq.next()</code>.
     * super.mN runs through 1, 2, 3, and so on.
     * We patch mAs.get(mN - 1) and then we recompute the internal structures mBs and mCs.
     * @return next term of the underlying sequence to be Euler transformed
     */
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
  } // BinarySequence
  
  /**
   * Sets the underlying sequence <code>b</code>
   * @param seq sequence b in the OEIS definition
   */
  public void setSequenceB(final Sequence seq) {
    mSeqB = seq;
  } 

  /**
   * Gets the resulting binary sequence
   * @return the vector <code>v</code> in the PARI program
   */
  public Sequence getBinarySequence() {
    return mSeq; // from EulerTransform
  } 

  /** Construct the sequence. */
  public A042953() {
    super();
    mSeq = new BinarySequence();
    setSequenceB(new SeqB53());
    mPreTerms = new Z[] { Z.ONE };
  }

  /** 
   * Generic constructor with parameter
   * @param seqB base sequence <code>b</code>.
   */
  public A042953(final Sequence seqB) {
    super();
    mSeq = new BinarySequence();
    setSequenceB(seqB);
    mPreTerms = new Z[] { Z.ONE };
  }

  @Override
  public Z next() {
    return super.next();
  }

  /**
   * Returns the terms of the underlying sequence
   */
  public Z nextBinary() {
    return mSeq.next();
  }

}
