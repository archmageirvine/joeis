package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a002.A002225;

/**
 * A060363 Smallest prime p such that first n primes (p_1=2, ..., p_n) are 13th power residues mod p.
 * @author Sean A. Irvine
 */
public class A060363 extends A002225 {

  /** Construct the sequence. */
  public A060363() {
    super(Z.valueOf(13), 4421);
  }
}
