package irvine.oeis.a048;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a049.A049312;

/**
 * A048194 Total number of split graphs (chordal + chordal complement) on n vertices.
 * @author Sean A. Irvine
 */
public class A048194 extends DifferenceSequence {

  /** Construct the sequence. */
  public A048194() {
    super(new A049312());
  }
}

