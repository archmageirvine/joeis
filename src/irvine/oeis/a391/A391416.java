package irvine.oeis.a391;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a046.A046099;
import irvine.oeis.a131.A131605;

/**
 * A391416 Perfect powers that are neither prime powers nor cubefree.
 * @author Sean A. Irvine
 */
public class A391416 extends IntersectionSequence {

  /** Construct the sequence. */
  public A391416() {
    super(1, new A046099(), new A131605());
  }
}
