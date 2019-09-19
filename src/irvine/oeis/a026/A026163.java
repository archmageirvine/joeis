package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;

/**
 * A026163.
 * @author Sean A. Irvine
 */
public class A026163 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026163() {
    super(new PrependSequence(new A026152(), 1));
  }
}
