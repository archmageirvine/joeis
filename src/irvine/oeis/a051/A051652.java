package irvine.oeis.a051;

import irvine.oeis.PositionOfNSequence;

/**
 * A051652 Smallest number at distance n from nearest prime.
 * @author Sean A. Irvine
 */
public class A051652 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A051652() {
    super(new A051700(), 0, 0);
    mMap.put(0L, 2L);
  }
}
