package irvine.oeis.a048;

import irvine.oeis.InverseSequence;
import irvine.oeis.a047.A047708;

/**
 * A048850 Position of n in sequence A047708.
 * @author Sean A. Irvine
 */
public class A048850 extends InverseSequence {

  /** Construct the sequence. */
  public A048850() {
    super(new A047708(), 0, 0);
  }
}
