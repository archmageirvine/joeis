package irvine.oeis.a181;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a061.A061439;

/**
 * A181354 Number of n-digit perfect cubes.
 * @author Sean A. Irvine
 */
public class A181354 extends DifferenceSequence {

  /** Construct the sequence. */
  public A181354() {
    super(new PrependSequence(new A061439(), 0));
  }
}

