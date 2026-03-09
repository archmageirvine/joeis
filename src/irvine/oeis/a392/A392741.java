package irvine.oeis.a392;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000977;
import irvine.oeis.a303.A303606;

/**
 * A392741 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A392741 extends IntersectionSequence {

  /** Construct the sequence. */
  public A392741() {
    super(1, new A000977(), new A303606());
  }
}

