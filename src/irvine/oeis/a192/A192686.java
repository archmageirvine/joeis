package irvine.oeis.a192;
// manually deris2/recordval at 2021-11-04

import irvine.oeis.RecordSubsequence;
import irvine.oeis.a048.A048377;
/**
 * A192686 Record values in A048377.
 * @author Georg Fischer
 */
public class A192686 extends RecordSubsequence {

  /** Construct the sequence. */
  public A192686() {
    super(new A048377());
    super.next();
  }
}
