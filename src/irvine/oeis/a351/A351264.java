package irvine.oeis.a351;

import irvine.oeis.PrependSequence;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A351264 Number of oriented graphs on n labeled nodes whose underlying graph is regular.
 * @author Gregory Morse
 */
public class A351264 extends PrependSequence {
  /** Construct the sequence. */
  public A351264() {
    super(0, new RowSumSequence(new A351263()), 1);
  }
}
