package irvine.oeis.a387;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A387614 allocated for Robin Visser.
 * @author Sean A. Irvine
 */
public class A387614 extends PrependSequence {

  /** Construct the sequence. */
  public A387614() {
    super(1, new PeriodicSequence(5), 4, 3, 3, 3, 4, 4);
  }
}
