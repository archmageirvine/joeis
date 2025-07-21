package irvine.oeis.a380;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a055.A055932;
import irvine.oeis.a332.A332785;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A380543 extends IntersectionSequence {

  /** Construct the sequence. */
  public A380543() {
    super(1, new A055932(), new A332785());
  }
}
