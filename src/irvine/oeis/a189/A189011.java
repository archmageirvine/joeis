package irvine.oeis.a189;
// manually 2021-09-17

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a014.A014132;

/**
 * A189011 Zero-one sequence based on triangular numbers:  a(A000217(k))=a(k); a(A014132(k))=1-a(k); a(1)=0.
 * @author Georg Fischer
 */
public class A189011 extends ArrayList<Z> implements Sequence {

  protected int mN; // current index
  protected int mU; // term of underlying sequence u
  protected int mV; // term of complement sequence v
  protected int mKu; // index k in u
  protected int mKv; // index k in v
  protected int mLen; // number of initial terms
  protected Sequence mSeqU; // underlying sequence U
  protected Sequence mSeqV; // complement sequence v

  /** Construct the sequence. */
  public A189011() {
    this(0, 1, new A000217(), new A014132(), 0);
  }

  /**
   * Generic constructor with parameters
   * @param offU offset of u
   * @param offV offset of v
   * @param seqU underlying sequence u; v is complement
   * @param seqV underlying sequence v; u is complement
   * @param inits initial terms a(1), a(2) etc.
   */
  public A189011(final int offU, final int offV, final Sequence seqU, final Sequence seqV, final int... inits) {
    mKu = offU;
    mKv = offV;
    mSeqU = seqU;
    mSeqV = seqV;
    mU = mSeqU.next().intValue();
    mV = mSeqV.next().intValue();
    while (mU <= 0) {
      mU = mSeqU.next().intValue();
    }
    while (mV <= 0) { 
      mV = mSeqV.next().intValue();
    }
    mKu = 1; // CK assumes this
    mKv = 1;
    add(null); // a(0) is not used
    mLen = inits.length;
    for (int i = 0; i < mLen; ++i) {
      add(Z.valueOf(inits[i])); // preset a(1..mLen)
    }
    mN = 0; // offset = 1
  }

  /*  n         0   1   2   3   4   5   6   7
      u         0,  1,  3,  6, 10 , 15, 21, 28         A000217
      v             2,  4,  5,  7 , 8,  9, 11         A014132
      expected      0*  1,  1,  0,  0,  1,  1,  1,  0
  */

  @Override
  public Z next() {
    ++mN;
    Z result = Z.NEG_ONE;
    // System.out.println("****" + ", mN=" + mN + ", mKu=" + mKu + ", mU=" + mU + ", mKv=" + mKv  + ", mV=" + mV + ", size=" + size() + ", a(" + (mN - 1) + ")=" + get(mN - 1));
    if (mN <= mLen) {
      result = get(mN);
    } else {
      while (mU < mN) {
        ++mKu;
        mU = mSeqU.next().intValue();
      }
      if (mN == mU) {
        result = get(mKu);
        ++mKu;
        mU = mSeqU.next().intValue();
      } else { 
        while (mV < mN) {
          ++mKv;
          mV = mSeqV.next().intValue();
        }
        if (mN == mV) {
          result = Z.ONE.subtract(get(mKv));
          ++mKv;
          mV = mSeqV.next().intValue();
          // } else {
          //   System.err.println("assert: " + ", mN=" + mN + ", mKu=" + mKu + ", mU=" + mU + ", mKv=" + mKv  + ", mV=" + mV + ", result=" + result + ", a(" + (mN - 1) + ")=" + get(mN - 1));
        }
      }
      add(result);
    }
    return result;
  }
}
