package irvine.oeis.a372;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a046.A046099;
import irvine.oeis.a286.A286708;

/**
 * A372404 Powerful numbers that are neither prime powers nor cubefree.
 * @author Sean A. Irvine
 */
public class A372404 extends IntersectionSequence {

  /** Construct the sequence. */
  public A372404() {
    super(new A046099(), new A286708());
  }
}
