package irvine.oeis.a079;

import irvine.oeis.PrependSequence;
import irvine.oeis.a077.A077019;

/**
 * A079582 Least positive k such that the distance from k to closest prime = n.
 * @author Sean A. Irvine
 */
public class A079582 extends PrependSequence {

  /** Construct the sequence. */
  public A079582() {
    super(0, new A077019().skip(3), 2, 1, 9);
  }
}
