package irvine.oeis.a078;

import irvine.oeis.FilterSequence;

/**
 * A078877 Nonprimes in A078447.
 * @author Sean A. Irvine
 */
public class A078877 extends FilterSequence {

  /** Construct the sequence. */
  public A078877() {
    super(1, new A078447(), k -> !k.isProbablePrime());
  }
}
