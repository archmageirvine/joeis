package irvine.oeis.a039;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a006.A006145;

/**
 * A039753 Numbers common to A006145 and A039752.
 * @author Sean A. Irvine
 */
public class A039753 extends IntersectionSequence {

  /** Construct the sequence. */
  public A039753() {
    super(new A039752(), new A006145());
  }
}
