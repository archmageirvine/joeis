package irvine.oeis.a033;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a015.A015922;

/**
 * A033554 In <code>A015922</code>, not in <code>A033553</code>.
 * @author Sean A. Irvine
 */
public class A033554 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A033554() {
    super(new A015922(), new A033553());
  }
}
