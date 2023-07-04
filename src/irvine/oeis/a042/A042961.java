package irvine.oeis.a042;
// manually

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000041;

/**
 * A042961 The sequence e when b is obtained by reversing the parity of Euler's partition function A000041.
 * @author Georg Fischer
 */
public class A042961 extends A042953 {

  /**
   * This sequence represents the vector <code>b</code> in the OEIS definition.
   */
  protected static class SeqB61 extends Sequence0 {
    private final Sequence mSeq41;
    public SeqB61() {
      mSeq41 = new A000041();
      mSeq41.next();
    }
    
    @Override
    public Z next() {
      return mSeq41.next().xor(Z.ONE);
    }
  } // mSeqB
  
  /** Construct the sequence. */
  public A042961() {
    super();
    mSeqB = new SeqB61();
  }

}
