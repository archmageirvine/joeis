package irvine.oeis.a048;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;

/**
 * A048134 Number of colors that can be mixed with up to n units of yellow, blue, red.
 * @author Sean A. Irvine
 */
public class A048134 extends PartialSumSequence {

  /** Construct the sequence. */
  public A048134() {
    super(new PrependSequence(new SkipSequence(new A048240(), 1), 0));
  }
}
