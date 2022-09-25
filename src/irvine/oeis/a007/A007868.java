package irvine.oeis.a007;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000085;
import irvine.oeis.a000.A000142;

/**
 * A007868 Number of inverse pairs of elements in symmetric group S_n, or pairs of total orders on n nodes (average of A000085 and A000142).
 * @author Sean A. Irvine
 */
public class A007868 extends Combiner {

  /** Construct the sequence. */
  public A007868() {
    super(new A000142(), new A000085(), AVERAGE);
  }
}
