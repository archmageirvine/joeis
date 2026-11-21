package irvine.oeis.a115;

/**
 * A115115 Number of 3-asymmetric rhythm cycles: binary necklaces of length 3n subject to the restriction that for any k if the k-th bead is of color 1 then the (k+n)-th and (k+2n)-th beads (modulo 3n) are of color 0.
 * @author Gregory Morse
 */
public class A115115 extends A115114 {
  /** Construct the sequence. */
  public A115115() {
    super(3, false);
  }
}
