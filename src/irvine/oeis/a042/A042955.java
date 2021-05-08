package irvine.oeis.a042;
// manually

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A042955 The sequence e when b=[ 1,1,0,1,1,... ].
 * @author Georg Fischer
 */
public class A042955 extends A042953 {

  /**
   * This sequence represents the vector <code>b</code> in the OEIS definition.
   */
  protected class SeqB55 implements Sequence {
    private int mN;
    public SeqB55() {
      mN = 0;
    }
    
    @Override
    public Z next() {
      return ++mN == 3 ? Z.ZERO : Z.ONE;
    }
  } // mSeqB
  
  /** Construct the sequence. */
  public A042955() {
    super();
    mSeqB = new SeqB55();
  }

}
