package irvine.oeis.a059;

import irvine.oeis.NestedSequence;
import irvine.oeis.a024.A024994;
import irvine.oeis.a024.A024995;

/**
 * A059994 Positions where number of periodic partitions increases.
 * @author Sean A. Irvine
 */
public class A059994 extends NestedSequence {

  /** Construct the sequence. */
  public A059994() {
    super(1, new A024994(), new A024995(), 1, 1);
  }
}
