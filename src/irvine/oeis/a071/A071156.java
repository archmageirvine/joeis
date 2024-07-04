package irvine.oeis.a071;

import irvine.oeis.PrependSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071156 Apart from the initial term (0), lists all integers whose factorial expansion ends with 1 (i.e., are odd numbers), do not contain a digit zero and each successive digit to the left is at most one greater than the preceding digit.
 * @author Sean A. Irvine
 */
public class A071156 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071156() {
    super(0, new PrependSequence(new A071158(), 0), A071155::factorialBaseToZ);
  }
}
