package irvine.oeis.a392;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a046.A046100;
import irvine.oeis.a332.A332785;

/**
 * A392537 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A392537 extends IntersectionSequence {

  /** Construct the sequence. */
  public A392537() {
    super(1, new A046100(), new A332785());
  }
}
