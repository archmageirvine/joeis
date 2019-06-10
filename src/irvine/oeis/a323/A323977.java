package irvine.oeis.a323;

import irvine.oeis.FiniteSequence;

/**
 * A323977 Expansion of determinant of <code>6 X 6</code> matrix <code>M_{u,v} = q^(maj(u*v^-1))</code> where u, v in <code>S_3</code> and <code>maj =</code> MacMahon's major index <code>(cf. A008302)</code>.
 * @author Georg Fischer
 */
public class A323977 extends FiniteSequence {

  /** Construct the sequence. */
  public A323977() {
    super(1, 0, -3, -4, 3, 12, 5, -12, -18, 0, 18, 12, -5, -12, -3, 4, 3, 0, -1);
  }
}
