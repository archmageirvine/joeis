package irvine.oeis.a049;

import irvine.oeis.RecordSequence;
import irvine.oeis.a346.A346778;

/**
 * A049478 Records for initial gap lengths g in the permutations found in A088643.
 * @author Sean A. Irvine
 */
public class A049478 extends RecordSequence {

  /** Construct the sequence. */
  public A049478() {
    super(new A346778());
  }
}
