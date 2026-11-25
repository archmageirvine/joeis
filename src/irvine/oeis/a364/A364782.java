package irvine.oeis.a364;

import irvine.oeis.MultiplicativeSequence;

/**
 * A364782 Order of the general symplectic group of 6 X 6 matrices over Z_n.
 * @author Gregory Morse
 */
public class A364782 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A364782() {
    super(1, (p, e) -> p.pow(22L * e - 13).multiply(p.subtract(1)).multiply(p.square().subtract(1)).multiply(p.pow(4).subtract(1)).multiply(p.pow(6).subtract(1)));
  }
}
