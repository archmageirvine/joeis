package irvine.oeis.a391;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a046.A046099;
import irvine.oeis.a332.A332785;

/**
 * A391319 Numbers that are neither cubefree nor powerful.
 * @author Sean A. Irvine
 */
public class A391319 extends IntersectionSequence {

  /** Construct the sequence. */
  public A391319() {
    super(new A046099(), new A332785());
  }
}
