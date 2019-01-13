package irvine.oeis.a007;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a000.A000004;
import irvine.oeis.a001.A001511;

/**
 * A007814.
 * @author Sean A. Irvine
 */
public class A007814 extends AlternatingSequence {

  /** Construct the sequence. */
  public A007814() {
    super(new A000004(), new A001511());
  }
}
