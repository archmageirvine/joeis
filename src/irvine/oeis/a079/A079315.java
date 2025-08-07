package irvine.oeis.a079;

import irvine.oeis.InterleaveSequence;
import irvine.oeis.a147.A147582;
import irvine.oeis.a151.A151914;

/**
 * A079315 Number of cells that change from OFF to ON at stage n of the cellular automaton described in A079317.
 * @author Sean A. Irvine
 */
public class A079315 extends InterleaveSequence {

  /** Construct the sequence. */
  public A079315() {
    super(0, new A151914(), new A147582());
  }
}
