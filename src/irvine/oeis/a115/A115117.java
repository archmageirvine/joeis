package irvine.oeis.a115;

/**
 * A115117 Number of primitive (aperiodic, or Lyndon) 3-asymmetric rhythm cycles: ones having no nontrivial shift automorphism. 3-asymmetric rhythm cycles (A115115): binary necklaces of length 3n subject to the restriction that for any k if the k-th bead is of color 1 then the (k+n)-th and (k+2n)-th beads (modulo 3n) are of color 0.
 * @author Gregory Morse
 */
public class A115117 extends A115114 {
  /** Construct the sequence. */
  public A115117() {
    super(3, true);
  }
}
