package irvine.oeis.a159;
// Generated by gen_seq4.pl hantraf/tuptraf at 2024-01-19 09:26

import irvine.math.z.Z;
import irvine.oeis.a000.A000178;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A159783 Hankel transform of ordered Bell numbers A000670. a(n)=det(A000670(i+j-1)), i,j=1,2..n.
 * @author Georg Fischer
 */
public class A159783 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A159783() {
    super(1, (n, s) -> s[1].multiply(Z.TWO.pow((long) (n - 1) * n / 2)).multiply(s[0]), "", new A000178(), PREVIOUS);
  }
}
