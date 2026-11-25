package irvine.oeis.a364;

import irvine.oeis.MultiplicativeSequence;

/**
 * A364783 Order of the symplectic group of 6 X 6 matrices over Z_n.
 * @author Gregory Morse
 */
public class A364783 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A364783() {
    super(1, (p, e) -> p.pow(21L * e - 12).multiply(p.square().subtract(1)).multiply(p.pow(4).subtract(1)).multiply(p.pow(6).subtract(1)));
  }
}
