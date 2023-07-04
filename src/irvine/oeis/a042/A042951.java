package irvine.oeis.a042;
// manually

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A042951 The sequence e when b=[ 0,1,1,1,1,... ].
 * @author Georg Fischer
 */
public class A042951 extends A042953 {

  /**
   * This sequence represents the vector <code>b</code> in the OEIS definition.
   */
  protected static class SeqB51 extends Sequence0 {
    private int mN;
    public SeqB51() {
      mN = 0;
    }
    
    @Override
    public Z next() {
      return ++mN == 1 ? Z.ZERO : Z.ONE;
    }
  } // mSeqB
  
  /** Construct the sequence. */
  public A042951() {
    super();
    mSeqB = new SeqB51();
  }

}
