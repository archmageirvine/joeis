package irvine.oeis.a187;
// manually deris/essent at 2022-10-26 11:22

import irvine.oeis.PrependSequence;
import irvine.oeis.a089.A089742;

/**
 * A187258 Number of UH^jD's for some j&gt;0, in all peakless Motzkin paths of length n (here U=(1, 1), D=(1,-1) and H=(1, 0); can be easily expressed using RNA secondary structure terminology).
 * @author Georg Fischer
 */
public class A187258 extends PrependSequence {

  /** Construct the sequence. */
  public A187258() {
    super(new A089742().skip(0), 0, 0, 0);
  }
}
