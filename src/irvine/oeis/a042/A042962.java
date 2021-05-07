package irvine.oeis.a042;
// manually

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A042962 The sequence e when b=[ 1, 0, 1, 0, 1, 0, 1, 0,... ].
 * @author Georg Fischer
 */
public class A042962 extends A042953 {

  /**
   * This sequence represents the vector <code>b</code> in the OEIS definition.
   */
  protected class SeqB62 implements Sequence {
    private int mN;
    public SeqB62() {
      mN = 0;
    }
    
    @Override
    public Z next() {
      return (++mN & 1) == 0 ? Z.ZERO : Z.ONE;
    }
  } // mSeqB
  
  /** Construct the sequence. */
  public A042962() {
    super();
    mSeqB = new SeqB62();
  }

}
