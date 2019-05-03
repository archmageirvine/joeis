package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a007.A007489;

/**
 * A014145 Partial sums of <code>A007489</code>.
 * @author Sean A. Irvine
 */
public class A014145 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014145() {
    super(new A007489());
  }
}
