package irvine.oeis.a051;

import irvine.oeis.PositionOfNSequence;

/**
 * A051519 Exactly n integer-sided triangles of perimeter a(n) have integer area.
 * @author Sean A. Irvine
 */
public class A051519 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A051519() {
    super(new A051516());
  }
}
