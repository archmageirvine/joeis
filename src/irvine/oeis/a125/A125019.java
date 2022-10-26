package irvine.oeis.a125;
// manually deris/recordval at 2022-10-26 11:22

import irvine.oeis.RecordSubsequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a063.A063983;

/**
 * A125019 Records in A063983 if the initial 4 is ignored (cf. A125848).
 * @author Georg Fischer
 */
public class A125019 extends RecordSubsequence {

  /** Construct the sequence. */
  public A125019() {
    super(new SkipSequence(new A063983(), 1));
  }
}
