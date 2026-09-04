package irvine.oeis.a059;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a007.A007434;

/**
 * A059381 a(n) = Product_{i=1..n} J_2(i).
 * @author Sean A. Irvine
 */
public class A059381 extends PartialProductSequence {

  /** Construct the sequence. */
  public A059381() {
    super(1, new A007434());
  }
}
