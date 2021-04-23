package irvine.oeis.a046;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002905;

/**
 * A046745.
 * @author Sean A. Irvine
 */
public class A046745 extends PartialSumSequence {

  /** Construct the sequence. */
  public A046745() {
    super(new SkipSequence(new A002905(), 1));
  }
}
