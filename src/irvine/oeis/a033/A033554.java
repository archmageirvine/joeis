package irvine.oeis.a033;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a015.A015922;

/**
 * A033554 In A015922, not in A033553.
 * @author Sean A. Irvine
 */
public class A033554 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A033554() {
    super(new A015922(), new A033553());
  }
}
