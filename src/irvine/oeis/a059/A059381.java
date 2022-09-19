package irvine.oeis.a059;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a007.A007434;

/**
 * A059381 Product J_2(i), i=1..n.
 * @author Sean A. Irvine
 */
public class A059381 extends PartialProductSequence {

  /** Construct the sequence. */
  public A059381() {
    super(new A007434());
  }
}
