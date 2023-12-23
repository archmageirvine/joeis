package irvine.oeis.a067;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000586;
import irvine.oeis.a000.A000959;

/**
 * A067594 Number of partitions of n into distinct lucky parts (A000959).
 * @author Sean A. Irvine
 */
public class A067594 extends PrependSequence {

  /** Construct the sequence. */
  public A067594() {
    super(0, new A000586(new A000959()).skip(), 0);
  }
}
