package irvine.oeis.a042;
// manually

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A042959 The sequence e when b=[ 1,1,1,1,0,1,1,1,... ].
 * @author Georg Fischer
 */
public class A042959 extends A042953 {

  /**
   * This sequence represents the vector <code>b</code> in the OEIS definition.
   */
  protected static class SeqB59 extends Sequence0 {
    private int mN;
    public SeqB59() {
      mN = 0;
    }
    
    @Override
    public Z next() {
      return ++mN == 5 ? Z.ZERO : Z.ONE;
    }
  } // mSeqB
  
  /** Construct the sequence. */
  public A042959() {
    super();
    mSeqB = new SeqB59();
  }

}
