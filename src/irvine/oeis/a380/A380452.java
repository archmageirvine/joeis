package irvine.oeis.a380;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a025.A025487;

/**
 * A380452 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A380452 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A380452() {
    super(1, new A380446(), new A025487());
  }
}
