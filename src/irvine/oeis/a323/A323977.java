package irvine.oeis.a323;

import irvine.oeis.FiniteSequence;

/**
 * A323977 Expansion of determinant of 6 X 6 matrix M_{u,v} = q^(maj(u*v^-1)) where u, v in S_3 and maj = MacMahon&apos;s major index (cf. A008302).
 * @author Georg Fischer
 */
public class A323977 extends FiniteSequence {

  /** Construct the sequence. */
  public A323977() {
    super(1, 0, -3, -4, 3, 12, 5, -12, -18, 0, 18, 12, -5, -12, -3, 4, 3, 0, -1);
  }
}
