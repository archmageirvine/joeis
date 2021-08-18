package irvine.oeis.a346;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A346302 Positions of words in A076478 such that first digit != last digit.
 * @author Sean A. Irvine
 */
public class A346302 extends ComplementSequence {

  /** Construct the sequence. */
  public A346302() {
    super(new A346301(), Z.ONE);
  }
}
