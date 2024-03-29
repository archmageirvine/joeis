package irvine.oeis.a282;
// Generated by patch_prepend.pl 2023-06-19 16:46

import irvine.oeis.MultiplicativeSequence;
import irvine.oeis.PrependSequence;

/**
 * A282254 Coefficients in q-expansion of (3*E_4^3 + 2*E_6^2 - 5*E_2*E_4*E_6)/1584, where E_2, E_4, E_6 are the Eisenstein series shown in A006352, A004009, A013973, respectively.
 * @author Georg Fischer
 */
public class A282254 extends PrependSequence {

  /** Construct the sequence. */
  public A282254() {
    super(new MultiplicativeSequence(0,  (p,  e) -> p.pow(e).multiply(p.pow(9L * (e + 1)).subtract(1)).divide(p.pow(9).subtract(1))).skip(1), 0);
  }
}
