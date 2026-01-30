package irvine.oeis.a392;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a332.A332785;
import irvine.oeis.a391.A391115;

/**
 * A392360 Nonsquarefree numbers that are neither squareful or biquadratefree.
 * @author Sean A. Irvine
 */
public class A392360 extends IntersectionSequence {

  /** Construct the sequence. */
  public A392360() {
    super(1, new A391115(), new A332785());
  }
}
