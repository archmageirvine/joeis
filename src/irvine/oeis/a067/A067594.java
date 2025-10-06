package irvine.oeis.a067;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000959;
import irvine.oeis.transform.RationalProductTransform;

/**
 * A067594 Number of partitions of n into distinct lucky parts (A000959).
 * @author Sean A. Irvine
 */
public class A067594 extends PrependSequence {

  /** Construct the sequence. */
  public A067594() {
    super(0, new RationalProductTransform(0, new RationalProductTransform.Builder().f(-1).g(-1).h(new A000959())).skip(), 0);
  }
}
