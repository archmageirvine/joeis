package irvine.oeis.a364;

import irvine.oeis.MultiplicativeSequence;

/**
 * A364771 Order of the symplectic group of 4 X 4 matrices over Z_n.
 * @author Gregory Morse
 */
public class A364771 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A364771() {
    super(1, (p, e) -> p.pow(10L * e - 6).multiply(p.square().subtract(1)).multiply(p.pow(4).subtract(1)));
  }
}
