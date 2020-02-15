package irvine.oeis.a117;

import irvine.oeis.PeriodicSequence;

/**
 * A117441 Periodic with repeating part <code>{1,1,0,1,-1,0,-1,-1,0,-1,1,0}</code>.
 * @author Sean A. Irvine
 */
public class A117441 extends PeriodicSequence {

  /** Construct the sequence. */
  public A117441() {
    super(1, 1, 0, 1, -1, 0, -1, -1, 0, -1, 1, 0);
  }
}
